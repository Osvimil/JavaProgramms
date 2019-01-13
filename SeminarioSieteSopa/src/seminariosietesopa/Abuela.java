
package seminariosietesopa;


public class Abuela extends Object {
    
    private String nombre;
    
    public Abuela(){
    
    }

    public Abuela(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    
    //No puede ser modificado por las subclases
    public final void prepararPozoleTradicional(){
        System.out.println("El pozole se prepara con carnitas");       
    }
    public void prepararSopa(){
        System.out.println("La sopa se prepara con pollo");
    
    
    }
    
    public void mostrar(){
        System.out.println("Yo soy la abuela: "+nombre);
    }
    
}
