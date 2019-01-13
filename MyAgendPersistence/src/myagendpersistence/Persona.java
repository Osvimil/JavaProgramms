
package myagendpersistence;

import java.io.Serializable;


public class Persona implements Serializable {
    
    private int clave;
    private String nombre;
    private String telefono;

    public Persona(int clave, String nombre, String telefono) {
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
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
}
