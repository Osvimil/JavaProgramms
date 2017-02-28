package fuentes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MuchosAMuchos {

    static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("MuchosAMuchosPU");
    static final EntityManager em = emf.createEntityManager(); //Realiza las operaciones sobre objetos
    static final EntityTransaction tx = em.getTransaction();  // Maneja las transacciones
    static final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

    static void agrega(Object o) {
        tx.begin();
        em.persist(o);
        tx.commit();
    }

    static Proyecto busca(int clavePro) {
        tx.begin();
        Proyecto c = em.find(Proyecto.class, clavePro);
        tx.commit();
        return c;
    }

    public static void main(String[] args) {
        try {
            final SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            final Proyecto pro1 = new Proyecto(1, "Rescate De Arboles",
                    fmt.parse("03/10/2015"), fmt.parse("05/01/2016"));
            final Proyecto pro2 = new Proyecto(2, "Adopta a un perro",
                    fmt.parse("01/01/2016"), fmt.parse("30/06/2016"));
            final Proyecto pro3 = new Proyecto(3, "Dona un riñoñ",
                    fmt.parse("03/09/2014"), fmt.parse("05/01/2016"));
            final Participante par1 = new Participante(1, "Francisco Morales");
            final Participante par2 = new Participante(2, "Mora Leja");
            final Participante par3 = new Participante(3, "Alma Madero");
            final Participante par4 = new Participante(4, "Kerry Kota");
            final Participante par5 = new Participante(5, "Pepe Nador");

            pro1.setParticipantes(new HashSet<Participante>(Arrays.asList(par2, par3, par5)));
            pro2.setParticipantes(new HashSet<Participante>(Arrays.asList(par2, par5)));
            par2.setProyectos(new HashSet<Proyecto>(Arrays.asList(pro1, pro2)));
            par3.setProyectos(new HashSet<Proyecto>(Arrays.asList(pro1)));
            par5.setProyectos(new HashSet<Proyecto>(Arrays.asList(pro1, pro2)));

            agrega(pro1);
            agrega(pro3);

            System.out.println(busca(1));
            System.out.println(busca(2));
            System.out.println(busca(3));
        } catch (ParseException ex) {
            ex.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }

    }

}
