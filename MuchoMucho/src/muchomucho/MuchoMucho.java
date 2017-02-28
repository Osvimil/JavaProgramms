
package muchomucho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class MuchoMucho {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MuchoMuchoPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction tx = em.getTransaction();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    

       
    public static void main(String[] args) throws ParseException {
        
        
        try{
            final Proyecto proyecto1 = new Proyecto(1,"Arboles al rescate",sdf.parse("03/10/2016"),sdf.parse("05/10/2017"));
            final Proyecto proyecto2 = new Proyecto(2,"Adopta un perro",sdf.parse("03/10/2016"),sdf.parse("05/10/2017"));
            final Proyecto proyecto3 = new Proyecto(3,"Dona un riñon",sdf.parse("03/10/2016"),sdf.parse("05/10/2017"));
            final Participante participante1 = new Participante(1,"Oswaldo");
            final Participante participante2 = new Participante(2,"Lupe");
            final Participante participante3 = new Participante(3,"Alfonso");
            final Participante participante4 = new Participante(4,"Paps");
            final Participante participante5 = new Participante(5,"Amazon");
            
            proyecto1.setPartcipantes(new HashSet<Participante>(Arrays.asList(participante2,participante3,participante5)));
            proyecto2.setPartcipantes(new HashSet<Participante>(Arrays.asList(participante2,participante5)));
            participante2.setProyectos(new HashSet<Proyecto>(Arrays.asList(proyecto1, proyecto2)));
            participante3.setProyectos(new HashSet<Proyecto>(Arrays.asList(proyecto1)));
            participante5.setProyectos(new HashSet<Proyecto>(Arrays.asList(proyecto1, proyecto2)));
            
            agregar(proyecto1);
            agregar(proyecto3);
            agregar(proyecto2);
            
            System.out.println(buscar(1));
            System.out.println(buscar(2));
            System.out.println(buscar(3));
        
            }catch(ParseException ex){
                ex.printStackTrace();
            }finally{
            em.close();
            emf.close();
        }      
    }
    
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
    
    
}
