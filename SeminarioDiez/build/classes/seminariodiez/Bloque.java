
package seminariodiez;


public class Bloque {
    
    static{
        System.out.println("5");
    }
    
    static{
    
        System.out.println("4");
    }
    
    static{
    
        System.out.println("3");
    }
    
    {
    
        System.out.println("2");
    }
    public void main (String...d){
    
        System.out.println("1");
        
        
    }
    
    static{
        System.out.println("0");
    }
    // PRIMERO SE EJECUTAN LOS BLOQUES ESTATICOS Y DESPUES LOS DE INSTANCIA
            
    
}
