
package proveedor;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ProveedorEficaz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clave;
    private String nombre;
    private String direccion;
    private String telefono; 
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String producto_que_vende;

    public ProveedorEficaz() {
    }

    public ProveedorEficaz(String nombre, String direccion, String telefono, Date fecha, String producto_que_vende) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.producto_que_vende = producto_que_vende;
    }

    public Long getClave() {
        return clave;
    }

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto_que_vende() {
        return producto_que_vende;
    }

    public void setProducto_que_vende(String producto_que_vende) {
        this.producto_que_vende = producto_que_vende;
    }   
}
