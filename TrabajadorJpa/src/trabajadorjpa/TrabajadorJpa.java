
package trabajadorjpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TrabajadorJpa {
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabajadorJpaPU");
    static final EntityManager em = emf.createEntityManager();
    static final EntityTransaction tx = em.getTransaction();
    static final SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
    
    
    public static Worker agregar(int clave, String nombre, String telefono, String fecha) throws ParseException{
            Worker w = new Worker();
            w.setClave(clave);
            w.setNombre(nombre);
            w.setTelefono(telefono);
            w.setFecha(fmt.parse(fecha));
            tx.begin();
            em.persist(w);
            tx.commit();
            return w;        
        }
    
     static void modificar(final Worker w, String nombre, String telefono, String fecha) throws ParseException{
        w.setNombre(nombre);
        w.setTelefono(telefono);
        w.setFecha(fmt.parse(fecha));
        tx.begin();
        em.merge(w);
        tx.commit();   
    }
    
     static void mostrar(){
    
        tx.begin();
        List<Worker> workers = em.createQuery(
                "SELECT w FROM Worker w",Worker.class
        ).getResultList();
        
        tx.commit();
        for(final Worker w: workers){
            System.out.println(w.getClave()+" "+w.getNombre()+" "+w.getTelefono()+" "+fmt.format(w.getFecha()));
        
        }
        
    }
    
     static void eliminar(final int clave){
        tx.begin();
        final Worker w = em.find(Worker.class, clave);
        if(w!=null){
            em.remove(w);
            System.out.println("Eliminado");
        
        }else{
            System.out.println("No existe ese ID");
        
        }
        tx.commit();    
    }
    

   
    public static void main(String[] args) {
        
        try {
            Worker oswaldo = agregar(1, "Oswaldo Peralta", "12903478", "09/04/1940");
            Worker alfonso = agregar(2,"Alfonsos Peralta","12903487","24/01/1959");
            Worker lupe = agregar(3,"Lupe Zaldivar","09218743","12/12/1982");
            
            System.out.println("Agregados");
            
             modificar(alfonso,"Alfonso Peralta","12903478","09/04/1940");
            System.out.println("Modificado, solo uno");
            mostrar();
            
            eliminar(1);
            System.out.println("Eliminado, solo uno");
            mostrar();
        } catch (ParseException parseException) {
        }
    }
    
}
