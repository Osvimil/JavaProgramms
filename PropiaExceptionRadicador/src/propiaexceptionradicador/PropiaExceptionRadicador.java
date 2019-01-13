
package propiaexceptionradicador;

import java.util.Scanner;


class RaizNegativaException extends Exception{
    public RaizNegativaException(String mensaje){
        super(mensaje);
        
    }
}

class RaizCuadrada{
    double numero;
    public RaizCuadrada(int numero){
        this.numero = numero;
    
    }
    public double obtenerRaiz() throws RaizNegativaException{
        if(numero<0){
            throw new RaizNegativaException("no se permiten numeros negativos");
        
        }else{
            return Math.sqrt(numero);
        
        }
        
    }
}




public class PropiaExceptionRadicador {

    
    public static void main(String[] args) {
        
        
        try{
            
            Scanner sc = new Scanner(System.in);
            int numero=0;
            System.out.println("Ingresa número: ");
            numero = sc.nextInt();
            RaizCuadrada raizCuadrada = new RaizCuadrada(numero);
            System.out.println("La raiz de: "+numero+" es: "+raizCuadrada.obtenerRaiz());
            
        
        }catch(RaizNegativaException r){
            System.out.println("Error: "+r.getMessage());
        
        }finally{
            System.out.println("Somos SIPPLY");
        
        }
        }
    }
        
    
    

