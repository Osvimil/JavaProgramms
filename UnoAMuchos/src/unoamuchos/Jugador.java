
package unoamuchos;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Jugador implements Serializable {
    
    
    @Id
    private int claveJu;
    private String nombre;
    @ManyToOne(cascade=CascadeType.ALL)
    private Equipo JuegaEn;

    public Jugador() {
    }

    public Jugador(int claveJu, String nombre) {
        this.claveJu = claveJu;
        this.nombre = nombre;
    }

    public int getClaveJu() {
        return claveJu;
    }

    public void setClaveJu(int claveJu) {
        this.claveJu = claveJu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public Equipo getJuegaEn() {
        return JuegaEn;
    }

    public void setJuegaEn(Equipo JuegaEn) {
        this.JuegaEn = JuegaEn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.claveJu;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.claveJu != other.claveJu) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "jugador["+getClaveJu()+" , "+getNombre()+"]";
    }
}
