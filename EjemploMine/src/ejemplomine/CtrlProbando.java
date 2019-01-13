
package ejemplomine;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityTransaction;
public class CtrlProbando {
    
    private static final EntityManagerFactory emf = EMF.getEntityManagerFactory();

    
   
    public List<Probando> lista() {

 final EntityManager em = getEntityManager();

 List<Probando> lista;

 try {
     
 lista = em.createQuery("SELECT z FROM Probando z ORDER BY z.nombre",Probando.class).getResultList();

 } finally {

 em.close();

 }

 return lista;

 }
    
    public Probando search(Long id){
        EntityManager em = getEntityManager();
        try{
        return em.find(Probando.class,id);
        }
        finally{
        em.close();
        }
    }
    
 public Probando add(Probando modelismo){
         final EntityManager em = getEntityManager();
         try{
             final EntityTransaction tx = em.getTransaction();
             tx.begin();
             em.persist(modelismo);
             tx.commit();
             return modelismo;
         }
         
         finally{
             em.close();
             
         }
 }
 
 public Probando modified(Probando modelismo){
     final EntityManager em = getEntityManager();
     try{
         final EntityTransaction tx = em.getTransaction();
         tx.begin();
         em.merge(modelismo);
         tx.commit();
     return modelismo;
     }
     finally{
         em.close();
     }
 }

public Probando delete(Probando id){
    
    final EntityManager em = getEntityManager();
    try{
        final EntityTransaction tx = em.getTransaction();
        tx.begin();
        final Probando model = em.find(Probando.class, id);

 if (model != null) {


 em.remove(model);

 }
        tx.commit();
    return model;
    }
    finally{
    em.close();
    }
}

 private static EntityManager getEntityManager() {

        return emf.createEntityManager();

 }
    
    
}
