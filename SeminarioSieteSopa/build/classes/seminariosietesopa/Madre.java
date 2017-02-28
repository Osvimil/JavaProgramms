
package seminariosietesopa;


public class Madre extends Abuela{
    private String nombre;
    
    public Madre(String nombre){
        super(nombre);
        
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Yo soy la madre:"+nombre);
    
    
    }
    
}
