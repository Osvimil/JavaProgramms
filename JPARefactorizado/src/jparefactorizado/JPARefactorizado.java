
package jparefactorizado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPARefactorizado {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARefactorizadoPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction et = em.getTransaction();
    static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

   
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        try{
            Conocido c1 = agregar(1,"Oswaldo","56334456","17/03/1993");
            Conocido c2 = agregar(2,"Alfonso","56334456","14/06/1991");
            
            
            Thread.sleep(2000);
            
        }catch(ParseException ex){
            ex.printStackTrace();
        
        }
        
        
        
        
        
    }
    
    static Conocido agregar(int id, String nombre, String telefono, String nacimiento) throws ParseException{
        
            Conocido c = new Conocido();
            c.setClave(id);
            c.setNombre(nombre);
            c.setTelefono(telefono);
            c.setNacimiento(fmt.parse(nacimiento));
            et.begin();
            em.persist(c);
            et.commit();
            return c;
        }
    
    static void visualizar(){
    
        Query query = em.createQuery("SELECT c FROM Conocido c");
        List<Conocido> conocidos = query.getResultList();
        for(Conocido c: conocidos){
            System.out.println(c);
        
        }
        
    
    }
    
    static void eliminar(Conocido c){
        et.begin();
        Conocido e = em.find(Conocido.class, c.getClass());
        if(e!=null){
            em.remove(e);
            
        
        }
        et.commit();
    
    }
    
    static void actualizar(Conocido c){
        et.begin();
        em.merge(c);
        et.commit();
        System.out.println("ACTUALIZADO "+c);
    
    }
}
