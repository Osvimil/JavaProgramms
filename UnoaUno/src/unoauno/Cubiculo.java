
package unoauno;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Cubiculo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int idC;
    private String ubicacion;
    
    @OneToOne(mappedBy="cubiculoAsignado_idC")
    private Empleado empleadoAsignar;
    
    public Cubiculo(){
    
    }

    public Cubiculo(int idC, String ubicacion) {
        this.idC = idC;
        this.ubicacion = ubicacion;
    }
    
    

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Empleado getEmpleadoAsignar() {
        return empleadoAsignar;
    }

    public void setEmpleadoAsignar(Empleado empleadoAsignar) {
        this.empleadoAsignar = empleadoAsignar;
    }   
}
