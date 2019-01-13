
package jparefactorizado;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Conocido implements Serializable {
    
    @Id
    @GeneratedValue
    private int clave;
    private String nombre;
    private String telefono;
    @Temporal(TemporalType.DATE)
    private Date nacimiento;

    public Conocido() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    @Override
    public String toString(){
    
        return "Nombre: "+nombre+ " Teléfono: "+telefono+" Nacmiento: "+nacimiento.toString();
    }  
}
