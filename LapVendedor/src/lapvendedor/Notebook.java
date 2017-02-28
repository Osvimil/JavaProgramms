
package lapvendedor;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Notebook implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int numeroDeSerie;
    private String marca;
    private String procesador;
    @OneToOne(mappedBy="tieneAsginada")
    private Vendedor seAsginaA;

    public Notebook() {
    }

    public Notebook(int numeroDeSerie, String marca, String procesador) {
        this.numeroDeSerie = numeroDeSerie;
        this.marca = marca;
        this.procesador = procesador;
    }
    
    

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Vendedor getSeAsginaA() {
        return seAsginaA;
    }

    public void setSeAsginaA(Vendedor seAsginaA) {
        this.seAsginaA = seAsginaA;
    }       
}
