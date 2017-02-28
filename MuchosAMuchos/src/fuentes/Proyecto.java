package fuentes;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Proyecto implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    private int clavePro;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date inicio;
    @Temporal(TemporalType.DATE)
    private Date fin;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Participante> participantes;
    
    public Proyecto() {
    }
    public Proyecto(int clavePro, String nombre, Date inicio, Date fin) {
        this.clavePro = clavePro;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }
    public void setClavePro(int clavePro) {
        this.clavePro = clavePro;
    }
    public int getClavePro() {
        return clavePro;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    public Date getInicio() {
        return inicio;
    }
    public void setFin(Date fin) {
        this.fin = fin;
    }
    public Date getFin() {
        return fin;
    }
    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }
    public Set<Participante> getParticipantes() {
        return participantes;
    }
    @Override
    public String toString() {
        return "Proyecto["+getNombre()+","+getParticipantes()+"]";
    }
    
}
