
package conocidito;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(uniqueConstraints={
    @UniqueConstraint(name="con_d_nombre", columnNames={"nombre"})})
public class Conocido implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull @Size(min=1, max=255)
    private String nombre;
    @NotNull @Pattern(regexp = "\\d{8,14}")
    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Conocido other = (Conocido) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   @Override
   public String toString(){
       return "conocidito.Conocido[id="+id+"]";
   
   }
    
}
