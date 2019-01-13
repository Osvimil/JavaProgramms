
package escaneo;
import java.util.Scanner;


public class Escaneo {

    
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        int valor;
        System.out.println("Dar número");
        valor= can.nextInt();
        
        System.out.println("El número dado es: "+valor);       
    }
    
}
