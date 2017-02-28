package unomuchosrefactor;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import unomuchosrefactor.Jugador;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-16T10:26:29")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, Integer> claveEq;
    public static volatile SetAttribute<Equipo, Jugador> jugadores;
    public static volatile SingularAttribute<Equipo, String> nombre;

}