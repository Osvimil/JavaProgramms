
package seminarioradicador;

import java.util.Scanner;

class RaizNegativaException extends Exception{
    public RaizNegativaException(String mensaje){
        super(mensaje);
    
    }
}

class RaizCuadrada{

    double numero;
    
    public RaizCuadrada(int numero){
        this.numero=numero;
    
    }
    public double obtenerRaiz() throws RaizNegativaException{
        if(numero<0){
            throw new RaizNegativaException("No se permite raiz negativa");
        
        }else{
            return Math.sqrt(numero);
            
        }     
    }
}


public class SeminarioRadicador {

    
    public static void main(String[] args) {
        
        
        try{
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa numero para sacar raiz");
        numero = sc.nextInt();
        RaizCuadrada raiz = new RaizCuadrada(numero);
        System.out.println("La raiz de: "+numero+" es: "+raiz.obtenerRaiz());
        }catch(RaizNegativaException rne){
            System.out.println(rne.getMessage());
        
        }finally{
            System.out.println("Soy de francia");
        }
        
    }
    
}
