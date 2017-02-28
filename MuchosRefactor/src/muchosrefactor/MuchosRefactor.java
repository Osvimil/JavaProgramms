
package muchosrefactor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MuchosRefactor {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MuchosRefactorPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction tx = em.getTransaction();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    
    static void agregar(Object o){
        tx.begin();
        em.persist(o);
        tx.commit();    
    }
    
    static Proyecto buscar(int clavePro){
        tx.begin();
        Proyecto c = em.find(Proyecto.class, clavePro);        
        tx.commit();
        return c;  
    }
    

    
    public static void main(String[] args) throws ParseException {
        
        try{
        final Proyecto proyecto1 = new Proyecto(1,"Desarrollo emprendedor",sdf.parse("12/06/2017"),sdf.parse("20/11/2017"));
        
        final Proyecto proyecto2 = new Proyecto(2,"Desarrollo tecnologico",sdf.parse("12/03/2017"),sdf.parse("20/09/2017"));
        
        final Proyecto proyecto3 = new Proyecto(3,"Desarrollo tecnico",sdf.parse("12/04/2017"),sdf.parse("20/08/2017"));
        
        final Participante participante1 = new Participante(1,"PEMEX");
        final Participante participante2 = new Participante(2,"ISSSTE");
        final Participante participante3 = new Participante(3,"IMSS");
        final Participante participante4 = new Participante(4,"SEGOB");
        final Participante participante5 = new Participante(5,"PRESIDENCIA");
        
        
        agregar(proyecto1);
        agregar(proyecto2);
        agregar(proyecto3);
        
        System.out.println(buscar(1));
        System.out.println(buscar(2));
        System.out.println(buscar(3));
        }catch(ParseException e){
            e.printStackTrace();
        
        }
        em.close();
        emf.close();
    }
    
    
}
