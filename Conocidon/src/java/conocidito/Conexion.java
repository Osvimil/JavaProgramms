
package conocidito;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Dependent
public class Conexion {
    @Produces @PersistenceUnit
    EntityManagerFactory emf;    
}
