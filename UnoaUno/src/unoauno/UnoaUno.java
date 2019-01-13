
package unoauno;

import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UnoaUno {
    
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnoaUnoPU");
    static final EntityManager em = emf.createEntityManager();
    static final EntityTransaction tx = em.getTransaction();
    
    
    static void agrega(Object o){
        tx.begin();
        em.persist(o);
        tx.commit();    
    }
    
    static void modifica(Empleado e){
        tx.begin();
        em.merge(e);
        tx.commit();    
    }
    
     static void modifica(Empleado e, Cubiculo c){
        tx.begin();
        Empleado e2 = em.merge(e);
        Cubiculo c2 = em.merge(c);
        
        e2.setCubiculoAsignado_idC(c2);
        c2.setEmpleadoAsignar(e2);
        tx.commit();    
    }
    
     static Cubiculo busca(int idC){
         tx.begin();
         Cubiculo c = em.find(Cubiculo.class, idC);
         tx.commit();
         return c;    
     }
     
     
     
    public static void main(String[] args) {
        
        final Empleado emp1 = new Empleado(1,"Oswaldo");
        final Empleado emp2 = new Empleado(2,"Alfonso");
        final Empleado emp3 = new Empleado(3,"Lupe");
        final Empleado emp4 = new Empleado(4,"papas");
        
        final Cubiculo c1 = new Cubiculo(1, "Cubiculo oriente");
        final Cubiculo c2 = new Cubiculo(2, "Cubiculo sur");
        final Cubiculo c3 = new Cubiculo(3, "Cubiculo norte");
        
        agrega(emp1);
        agrega(emp2);
        agrega(emp3);
        agrega(emp4);
        agrega(c1);
        agrega(c2);
        agrega(c3);
        
        emp2.setCubiculoAsignado_idC(c1);
        c1.setEmpleadoAsignar(emp2);
        
        emp4.setCubiculoAsignado_idC(c3);
        c3.setEmpleadoAsignar(emp4);
        modifica(emp2);
        modifica(emp4);               
    }
    
}
