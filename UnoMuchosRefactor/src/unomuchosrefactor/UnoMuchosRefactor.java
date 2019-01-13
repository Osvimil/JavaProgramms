
package unomuchosrefactor;

import java.util.Arrays;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UnoMuchosRefactor {
    
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnoMuchosRefactorPU");
    static EntityManager em = emf.createEntityManager();
    static EntityTransaction tx = em.getTransaction();
    
    static void agregar(Object o){
        tx.begin();
        em.persist(o);
        tx.commit();
    
    }
    
    static Equipo buscar(int idEq){
        tx.begin();
        Equipo e = em.find(Equipo.class, idEq);
        tx.commit();
        return e;    
    }
    
    

   
    public static void main(String[] args) {
        
        try{
        Equipo toluca = new Equipo(1,"Puebla");
        Jugador esquivel = new Jugador(1,"Carlos");
        Jugador sina = new Jugador(2,"Antonio");
        Jugador rubens = new Jugador(3,"Sambueza");
        
        toluca.setJugadores(new HashSet<Jugador>(Arrays.asList(esquivel,sina,rubens)));
        esquivel.setJuegaEn(toluca);
        sina.setJuegaEn(toluca);
        rubens.setJuegaEn(toluca);
        
        
        
        
        Equipo america = new Equipo(2,"Santos");
        Jugador quintero = new Jugador(4,"quintero");
        Jugador oribe = new Jugador(5,"peralta");
        Jugador goals = new Jugador(6,"paolo");
        
        america.setJugadores(new HashSet<Jugador>(Arrays.asList(quintero,oribe,goals)));
        quintero.setJuegaEn(america);
        oribe.setJuegaEn(america);
        goals.setJuegaEn(america);
        
        agregar(toluca);
        agregar(america);
        } finally{
            em.close();
            emf.close();
        }
        
        
        
    }
    
}
