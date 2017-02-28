package fuentes;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Participante implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    private int clavePar;
    private String nombre;
    @ManyToMany(mappedBy = "participantes", cascade = CascadeType.ALL)
    private Set<Proyecto>proyectos;
    public Participante() {
    }
    public Participante(int clavePar, String nombre) {
        this.clavePar = clavePar;
        this.nombre = nombre;
    }
    public void setClavePar(int clavePar) {
        this.clavePar = clavePar;
    }
    public int getClavePar() {
        return clavePar;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public Set<Proyecto> getProyectos() {
        return proyectos;
    }    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.clavePar;
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
        final Participante other = (Participante) obj;
        if (this.clavePar != other.clavePar) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Participantes["+getNombre()+"]";
    }
    
}
