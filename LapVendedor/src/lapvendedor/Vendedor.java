
package lapvendedor;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Vendedor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int clave;
    private String nombre;
    @OneToOne(cascade={CascadeType.ALL})
    private Notebook tieneAsginada;

    public Vendedor() {
    }

    public Vendedor(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
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

    public Notebook getTieneAsginada() {
        return tieneAsginada;
    }

    public void setTieneAsginada(Notebook tieneAsginada) {
        this.tieneAsginada = tieneAsginada;
    }      
}
