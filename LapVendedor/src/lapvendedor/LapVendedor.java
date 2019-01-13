
package lapvendedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class LapVendedor {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LapVendedorPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction tx = em.getTransaction();
    
    
    static void agrega(Object o){
        tx.begin();
        em.persist(o);
        tx.commit();    
    }

    
    public static void main(String[] args) {
        
        final Vendedor ven1 = new Vendedor(1,"chairo");
        final Vendedor ven2 = new Vendedor(2,"Alfonso");
        final Vendedor ven3 = new Vendedor(3,"Lupe");
        final Vendedor ven4 = new Vendedor(4,"Paps");
        
        final Notebook lap1 = new Notebook(1234, "HP","PENTIUM");
        final Notebook lap2 = new Notebook(2345, "Apple","Core i7");
        final Notebook lap3 = new Notebook(3567, "Linux","core i4");
        
        agrega(ven1);
        agrega(ven2);
        agrega(ven3);
        agrega(ven4);
        agrega(lap1);
        agrega(lap2);
        agrega(lap3);
        
        ven1.setTieneAsginada(lap3);
        lap3.setSeAsginaA(ven1);
        
        ven2.setTieneAsginada(lap2);
        lap2.setSeAsginaA(ven2);
        
        
        
    }
    
}
