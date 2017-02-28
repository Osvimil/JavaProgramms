
package anotherexc;


public class Anotherexc {

    
    public static void main(String[] args) {
        String nombre, contrasena, repcontrasena;
        nombre= "Oswaldo";
        contrasena = "1234567";
        repcontrasena= "1234567";
        
        Ayudar ayuda = new Ayudar();
        try{
            ayuda.ValidarContrasena(contrasena,repcontrasena);
            System.out.println("Tus contrasena y validacion de la misma son iguales");
        }
        catch(CustomException e){
            System.out.println("Is not possible to registrer due to: "+e.getMessage());
            
        }
       
    }
    
}
