
package unomuchosrefactor;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipo implements Serializable {
    
   @Id
   private int claveEq;
   private String nombre;
   @OneToMany(mappedBy="JuegaEn", cascade ={CascadeType.PERSIST, CascadeType.MERGE})
   private Set<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(int claveEq, String nombre) {
        this.claveEq = claveEq;
        this.nombre = nombre;
    }

    public int getClaveEq() {
        return claveEq;
    }

    public void setClaveEq(int claveEq) {
        this.claveEq = claveEq;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Set<Jugador> getJugadores(){
        return jugadores;
    }
    
    public void setJugadores(Set<Jugador> jugadores){
        this.jugadores=jugadores;
    
    }
    
    @Override
    public String toString(){
        return "Equipo["+getClaveEq()+","+getNombre()+getJugadores()+"]";
    }   
}
