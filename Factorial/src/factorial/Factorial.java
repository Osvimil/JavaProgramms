
package factorial;

import javax.swing.*;
import java.util.Scanner;

/*
    HACER ESTE PROGRAMA CON JOPTION
    Y HACERLO VARIAS VECES CON DO--WHILE
*/



public class Factorial {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero =0;
        int auxiliar = 1;
        
        System.out.println("Ingresa numero para factorial");
        numero = sc.nextInt();
        while(numero>0){
            auxiliar = auxiliar * numero;         
            numero = numero-1;
        }
        System.out.println("Resultado: "+auxiliar);
        
        /*Scanner sc = new Scanner(System.in);
        int numero=0;
        int auxiliar=1;
        
        
        System.out.println("Ingresa número factorial: ");
        numero = sc.nextInt();
        while(numero>0){
        
        auxiliar = auxiliar*numero;
        numero--;
        }
        System.out.println("Resultado: "+auxiliar); */
       
             
    }
    
}
