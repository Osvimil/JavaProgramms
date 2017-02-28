
package ejemplomine;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
public class EMF {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EjemploMinePU");

 private EMF() {

 }

 public static EntityManagerFactory getEntityManagerFactory() {

 return entityManagerFactory;

 }
    
}
