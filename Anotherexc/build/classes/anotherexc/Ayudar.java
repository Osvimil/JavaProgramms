
package anotherexc;


public class Ayudar {
    Ayudar(){}
    
    public boolean ValidarContrasena(String contrasena, String repcontrasena) throws CustomException{
        if(!contrasena.equals(repcontrasena)){
        throw new CustomException("Los campos son diferentes");
        }
        
        if(contrasena.length()<7){
        throw new CustomException("La contrasena es muy corta");
        }
        
        return true;
        
    }
    
}
