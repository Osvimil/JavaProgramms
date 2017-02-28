
package jpaseminariosegundo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JPASeminarioSegundo {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPASeminarioSegundoPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction et = em.getTransaction();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    
    public static void main(String[] args) throws ParseException {
        
        Conocidillo oswaldo = agregar(1,"Oswaldo Peralta","12345678","17/03/1993");
        Conocidillo paps = agregar(2,"Paps Saldivar","90785634","9/12/15");
        Conocidillo alfonso = agregar(3,"Alfonso Peralta","12345678","14/06/1991");
        Conocidillo amazon = agregar(4,"Amazon Saldivar","90785634","10/11/16");
        System.out.println("Agregados");
        
        modificar(oswaldo,"Oswaldo Saldivar","12345678","17/03/1993");
        System.out.println("Modificado");
        mostrar();
        eliminar(4);
        System.out.println("Eliminado");
        mostrar();       
    }
    
    public static Conocidillo agregar(int clave, String nombre, String telefono, String fecha) throws ParseException{
        Conocidillo c = new Conocidillo();
        c.setClave(clave);
        c.setNombre(nombre);
        c.setTelefono(telefono);
        c.setFecha(sdf.parse(fecha));
        et.begin();
        em.persist(c);
        et.commit();
        return c;    
    }
    
    static void modificar(final Conocidillo c, String nombre, String telefono,String fecha) throws ParseException{
        c.setNombre(nombre);
        c.setTelefono(telefono);
        c.setFecha(sdf.parse(fecha));
        et.begin();
        em.persist(c);
        et.commit();    
    }
    
    static void mostrar(){
    
        et.begin();
        List<Conocidillo> conocido = em.createQuery("SELECT c FROM Conocidillo c",Conocidillo.class).getResultList();
        et.commit();
        for(final Conocidillo c: conocido){
            System.out.println(c.getClave()+"-"+c.getNombre()+"-"+c.getTelefono()+"-"+sdf.format(c.getFecha()));
        
        }
        
    }
    
    static void eliminar(final int clave){
        et.begin();
        final Conocidillo c = em.find(Conocidillo.class, clave);
        if(c!=null){
            em.remove(c);
            System.out.println("Eliminado");
        
        }else{
            System.out.println("No existe ese ID");
        
        }
        et.commit();
    
    }
    
    
    
}
