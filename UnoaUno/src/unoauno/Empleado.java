
package unoauno;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Empleado implements Serializable {
    
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private int idE;
    private String nombre;
    @OneToOne(cascade={CascadeType.ALL})
    private Cubiculo cubiculoAsignado_idC;
    
    public Empleado(){
    
    }

    public Empleado(int idE, String nombre) {
        this.idE = idE;
        this.nombre = nombre;
    }
    

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cubiculo getCubiculoAsignado_idC() {
        return cubiculoAsignado_idC;
    }

    public void setCubiculoAsignado_idC(Cubiculo cubiculoAsignado_idC) {
        this.cubiculoAsignado_idC = cubiculoAsignado_idC;
    }    
}
