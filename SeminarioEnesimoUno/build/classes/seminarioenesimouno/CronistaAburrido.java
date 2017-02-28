
package seminarioenesimouno;


public class CronistaAburrido extends Persona implements Cronista {

    public CronistaAburrido(String nombre) {
        super(nombre);
    }

    @Override
    public void gol() {
        System.out.println("gol");
       
    }

    @Override
    public void penalti() {
        System.out.println("penalti");
         
    }
    
    
   
    
    
  
    
}
