package muchosrefactor;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import muchosrefactor.Participante;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-15T11:22:26")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ { 

    public static volatile SingularAttribute<Proyecto, Date> inicio;
    public static volatile SingularAttribute<Proyecto, Date> fin;
    public static volatile SingularAttribute<Proyecto, String> nombre;
    public static volatile SingularAttribute<Proyecto, Integer> clavePro;
    public static volatile SetAttribute<Proyecto, Participante> participantes;

}