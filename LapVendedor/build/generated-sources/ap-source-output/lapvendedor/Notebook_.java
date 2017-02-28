package lapvendedor;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lapvendedor.Vendedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T20:16:06")
@StaticMetamodel(Notebook.class)
public class Notebook_ { 

    public static volatile SingularAttribute<Notebook, String> marca;
    public static volatile SingularAttribute<Notebook, Integer> numeroDeSerie;
    public static volatile SingularAttribute<Notebook, String> procesador;
    public static volatile SingularAttribute<Notebook, Vendedor> seAsginaA;

}