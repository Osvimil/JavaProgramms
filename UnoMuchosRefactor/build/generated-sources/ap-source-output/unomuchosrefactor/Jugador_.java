package unomuchosrefactor;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import unomuchosrefactor.Equipo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-16T10:26:29")
@StaticMetamodel(Jugador.class)
public class Jugador_ { 

    public static volatile SingularAttribute<Jugador, Integer> claveJu;
    public static volatile SingularAttribute<Jugador, String> nombre;
    public static volatile SingularAttribute<Jugador, Equipo> JuegaEn;

}