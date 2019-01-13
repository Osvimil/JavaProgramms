
package conocidito;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


@Named @ViewScoped
public class CtrlConocido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject private EntityManagerFactory emf;
    private boolean nuevo;
    private List<Conocido> instancias;
    private Conocido modelo;
    
    public boolean isNuevo(){
        return nuevo;
    }
    
    public List<Conocido> getInstancias(){
        return instancias;
    }
    
    public Conocido getModelo(){
        return modelo;
    }
    @PostConstruct public void inicia(){
        EntityManager em = null;
        try{
            em = iniciaTransaccion();
            consulta(em);
            commit(em);
        }catch(Exception e){
            procesa("error consultando",e);
        
        }finally{
            cierra(em);
        }
        
    
    }
    public void edita(Conocido modelo){
            nuevo = false;
            this.modelo = modelo;
        }
    public void guarda(){
        EntityManager em = null;
        try{
            em = iniciaTransaccion();
            if(nuevo){
                em.persist(modelo);
            }else{
                em.merge(modelo);
            }
            em.flush();
            consulta(em);
            commit(em);
        
        }catch(Exception e){
            procesa("error guardando",e);
        
        }finally{
            cierra(em);
        }
    }
    
    public void elimina(){
        EntityManager em = null;
        try{
            em = iniciaTransaccion();
            if(!nuevo && modelo != null){
                final Conocido anterior = em.find(Conocido.class, modelo.getId());
                if(anterior!=null){
                    em.remove(anterior);
                
                }
                em.flush();
                consulta(em);
                commit(em);
            }
            
        
        }catch(Exception e){
            procesa("error eliminado",e);
        
        }finally{
            cierra(em);
        }
    }
    
    public void consulta(EntityManager em){
        instancias = em.createQuery("SELECT c FROM Conocido c ORDER BY c.nombre",Conocido.class).getResultList();
        nuevo = true;
        modelo = new Conocido();
    }
    
    private void procesa(String mensaje, Throwable e){
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
