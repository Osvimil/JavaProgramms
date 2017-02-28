
package pilaexcepciones;

import java.util.Scanner;

class DesbordamientoPilaException extends Exception{

    public DesbordamientoPilaException(String mensaje){
        super(mensaje);
    }
    
}

class PilaVaciaException extends Exception{
    public PilaVaciaException(String mensaje){
        super(mensaje);
    
    }
}

class Pila{
    private int tope=0;
    private  int [] lista = new int[5];
    
    public void meter(int ele) throws DesbordamientoPilaException{
        if(tope>=5){
            throw new DesbordamientoPilaException("pila llena");
        }
        else{
            lista[tope++]=ele;
        }
    }
    
    public int sacar() throws PilaVaciaException{
        if(tope<=0){
            throw new PilaVaciaException("pila esta  vacia");
        }else{
            return lista[--tope];
        }
    }
}


public class PilaExcepciones {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pila pilon = new Pila();
        
        try{
             for (int i = 0; i <5; i++) {
                 
                System.out.println("Ingresa numeros:");
                pilon.meter(sc.nextInt());
        }
             
             System.out.println("Elementos de la pila:");
             for (int j = 0; j <5; j++) {
                 System.out.printf("%30d\n",pilon.sacar());
                
            }
        
        }catch(DesbordamientoPilaException dpe){
            dpe.getMessage();
        }catch(PilaVaciaException pve){
            System.out.println(pve.getMessage());           
        }
        
        finally{
            System.out.println("Siempre en ejecucion");
        }        
    }
    
}
