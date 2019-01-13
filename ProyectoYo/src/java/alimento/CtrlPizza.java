
package alimento;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Named @ViewScoped
public class CtrlPizza implements Serializable{
    private static final long serialVersionUID = 1L;
  @Inject private EntityManagerFactory emf;
  private boolean nuevo;
  private List<Pizza> instancias;
  private Pizza modelo;
  
  public boolean isNuevo() {
    return nuevo;
  }
  
  public List<Pizza> getInstancias() {
    return instancias;
  }
  public Pizza getModelo() {
    return modelo;
  }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public void setInstancias(List<Pizza> instancias) {
        this.instancias = instancias;
    }

    public void setModelo(Pizza modelo) {
        this.modelo = modelo;
    }
  
  
  @PostConstruct public void inicia() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      consulta(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error consultando.", e);
    } finally {
      cierra(em);
    }
  }
  
  public void edita(Pizza modelo) {
    nuevo = false;
    this.modelo = modelo;
  }
  public void guarda() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      if (nuevo) {
        em.persist(modelo); // Agrega el modelo a la base de datos.
      } else {
        em.merge(modelo);// Guarda los cambios al modelo.
      }
      em.flush(); // sincroniza la transacción con la base de datos.
      consulta(em);
      commit(em);
    } catch (Exception e) {
      procesa("Error guardando.", e);
    } finally {
      cierra(em);
    }
  }
  public void elimina() {
    EntityManager em = null;
    try {
      em = iniciaTransaccion();
      if (!nuevo && modelo != null) {
        // Busca el chismoso en base a su id.
        final Pizza anterior = em.find(Pizza.class, modelo.getId());
        // Si el resultado es null, el chismoso ya no está registrado.
        if (anterior != null) {
          /* Pero si la referencia es diferente de null, hay que eliminar el
           * objeto. */
          em.remove(anterior);
        }
        em.flush(); // sincroniza la transacción con la base de datos.
        consulta(em);
        commit(em);
      }
    } catch (Exception e) {
      procesa("Error eliminando.", e);
    } finally {
      cierra(em);
    }
  }
   private void consulta(EntityManager em) {
    /* Con el resultado de la consulta se llena una lista con objetos de la
     * clase "Conocido". */
    instancias = em.createQuery("SELECT c FROM Pizza c ORDER BY c.nombre",
        Pizza.class).getResultList();
    nuevo = true;
    modelo = new Pizza();
  }
   
     private void procesa(String mensaje, Throwable e) {
    Logger.getLogger(getClass().getName()).log(Level.SEVERE, mensaje, e);
    while (e.getCause() != null) {
      e = e.getCause();
    }
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_ERROR, getMensaje(e), null));
  }
  private String getMensaje(Throwable e) {
    final String mensaje = e.getLocalizedMessage();
    return mensaje == null || mensaje.isEmpty() ? e.toString() : mensaje;
  }
   private EntityManager iniciaTransaccion() {
    final EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    return em;
  }
  private void commit(EntityManager em) {
    em.getTransaction().commit();
  }
  private void cierra(EntityManager em) {
    if (em != null) {
      try {
        if (em.getTransaction().isActive()) {
          try {
            em.getTransaction().rollback();
          } catch (Exception e) {
            Logger.getLogger(getClass().getName()).
                log(Level.SEVERE, "Error al hacer rollback.", e);
          }
        }
      } finally {
        em.close();
      }
    }
  } 
}
