
package jpaSeminario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaSeminario {

   
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaSeminarioPU");
    static final EntityManager em = emf.createEntityManager();
    static final EntityTransaction tx = em.getTransaction();
    static final SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
    
    
    public static Conocido agregar(int clave, String nombre, String telefono, String fecha) throws ParseException{
        Conocido c = new Conocido();
        c.setClave(clave);
        c.setNombre(nombre);
        c.setTelefono(telefono);
        c.setFecha(fmt.parse(fecha));
        tx.begin();
        em.persist(c);
        tx.commit();
        return c;    
    }
    
    static void modifica(final Conocido c, String nombre,String telefono, String fecha) throws ParseException{
        
        c.setNombre(nombre);
        c.setTelefono(telefono);
        c.setFecha(fmt.parse(fecha));
        tx.begin();
        em.merge(c);
        tx.commit();
    }
    
    static void muestra(){
        tx.begin();
        List<Conocido> conocidos = em.createQuery(
                "SELECT c FROM Conocido c",Conocido.class).getResultList();
        tx.commit();
        for(final Conocido c: conocidos){
            System.out.println(c.getClave()+" - "+c.getNombre()+" - "+c.getTelefono()+" - "+fmt.format(c.getFecha()));
        }  
    }
    
    static void eliminar(final int clave){
        tx.begin();
        final Conocido c = em.find(Conocido.class, clave);
        if(c!=null){
            em.remove(c);
            System.out.println("eliminado");        
        }else{
            System.out.println("no existe esa clave");
        }
        tx.commit();      
    }
    
    
    
    public static void main(String[] args) {
        
        try {
            Conocido zoila = agregar(1000, "zoila vaca", "56331123", "12/01/1992");
            Conocido oswaldo = agregar(1001, "oswaldo saldivar", "56331134", "12/01/1992");
            Conocido lupe = agregar(1002, "lupe saldivar", "563311245", "12/01/1992");
            Conocido alfonso = agregar(1003, "alfonso saldivar", "5633111", "12/01/1992");
            System.out.println("Conocido agregado");
            modifica(zoila,"miguel","56339900","12/01/1992");
            System.out.println("Modificado");
            muestra();
            eliminar(1000);
            System.out.println("Ha sido eliminado");
            muestra();
                   
        } catch (ParseException parseException) {
        }      
    }
    
}
