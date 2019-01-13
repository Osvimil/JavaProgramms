
import com.sun.istack.logging.Logger;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import sun.util.logging.PlatformLogger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oswaldosaldivar
 */
@Named @ViewScoped
public class CtrlConocido implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Inject private EntityManagerFactory emf;
    private boolean nuevo;
    private List<Conocidos> instancias;
    private Conocidos modelo;
    
    public boolean isNuevo(){
        return nuevo;
    }
    
    public List<Conocidos> getInstancias(){
        return instancias;
    }
    public Conocidos getModelo(){
        return modelo;
    }
    
    @PostConstruct public void inicia(){
        EntityManager em = null;
        try{
            em = iniciaTransaccion();
            consulta(em);
            commit(em);        
        }catch(Exception e){
            procesa("Error consultado.",e);
        
        }finally{
            cierra(em);
        }
        
    }
    
    public void edita(Conocidos modelo){
        nuevo=false;
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
            en.flush();
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
                final Conocidos anterior = em.find(Conocidos.class,modelo.getId());
                
                if(anterior !=null){
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
        instancias = em.createQuery("SELECT c FROM conocidos c ORDER BY c.nombre",Conocidos.class).getResultList();
        nuevo = true;
        modelo = new Conocidos();
    
    }
    
    private void procesa(String mensaje, Throwable e){
        Logger.getLogger(getClass().getName().log(Level.SEVERE,mensaje,e));
        while(e.getCause()!=null){
            e= e.getCause();
        
        }
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(
                FacesMessage.SEVERITY_ERROR,getMessage(e),null);
                       
        )
        
        
        
    }
    
    
    }

    private String getMensaje(Throwable e){
    final String mensaje = e.getLocalizedMessage();
return mensaje == null || mensaje.isEmpty() ? e.toString(): mensaje;

}

public void commit(EntityManager em){
em.getTransaction().commit();
}
private void cierra(EntityManager em){
    if(em!=null){
        try{
         if(em.getTransaction.isActive()){
try{
    em.getTransaction().rollBack();
}catch(Exception e){
    Logger.getLogger(getClass().getName()).log(Level.SEVERE, "ERROR AL HACER ROLLBACK",e);


}finally{
    em.close();
}

}
}


}
}

    
    
    
}
