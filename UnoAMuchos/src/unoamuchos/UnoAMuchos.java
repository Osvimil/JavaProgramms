
package unoamuchos;

import java.util.Arrays;
import java.util.HashSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;




public class UnoAMuchos {
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnoAMuchosPU");
    static final EntityManager em = emf.createEntityManager();
    static final EntityTransaction tx = em.getTransaction();
    
    static void agrega(Object o){
    
        tx.begin();
        em.persist(o);
        tx.commit();
    }
    
    
    static Equipo busca(int idEq){
        tx.begin();
        Equipo e = em.find(Equipo.class, idEq);
        tx.commit();
        return e;
    
    }

    
    public static void main(String[] args) {
        
        try {
            Equipo eq1 = new Equipo(1, "Toluca");
            Jugador jug1 = new Jugador(1, "Messi");
            Jugador jug2 = new Jugador(2, "Ronaldo");
            Jugador jug3 = new Jugador(3, "Romario");
            
            eq1.setJugadores(new HashSet<Jugador>(Arrays.asList(jug1, jug2, jug3)));
            jug1.setJuegaEn(eq1);
            jug2.setJuegaEn(eq1);
            jug3.setJuegaEn(eq1);
            
            Equipo eq2 = new Equipo(2, "Pumas");
            Jugador jug4 = new Jugador(4, "Ronaldino");
            Jugador jug5 = new Jugador(5, "Kaka");
            Jugador jug6 = new Jugador(6, "Di Maria");
            eq2.setJugadores(new HashSet<Jugador>(Arrays.asList(jug4, jug5, jug6)));
            jug4.setJuegaEn(eq2);
            jug5.setJuegaEn(eq2);
            jug6.setJuegaEn(eq2);
            
            agrega(eq1);
            agrega(eq2);
            
        } finally {
            em.close();
            emf.close();
        }
        
        
        
    }
    
}
