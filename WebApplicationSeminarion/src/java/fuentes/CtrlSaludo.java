
package fuentes;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("cSaludo")
@RequestScoped
public class CtrlSaludo {
    
    private String nombre;
    private String resultado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void muestra(){
    
        resultado = "Hola: "+nombre;
    }   
}
