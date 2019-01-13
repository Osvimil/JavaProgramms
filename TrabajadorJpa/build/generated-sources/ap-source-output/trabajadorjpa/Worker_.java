package trabajadorjpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-02T10:13:26")
@StaticMetamodel(Worker.class)
public class Worker_ { 

    public static volatile SingularAttribute<Worker, Date> fecha;
    public static volatile SingularAttribute<Worker, Integer> clave;
    public static volatile SingularAttribute<Worker, String> telefono;
    public static volatile SingularAttribute<Worker, String> nombre;

}