
package fuentes;
import java.util.Scanner;

public class Cadenas {
   

   
    public static void main(String[] args) {
        /*String cadena = "cAdenA vAciA";
        System.out.println(cadena.charAt(7));
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.startsWith("cad"));
        System.out.println(cadena.substring(2, 4)); //devuelve 4-1=3*/
        
          
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        System.out.println("Ingresa texto: ");
        cadena = sc.nextLine();
        
        for (int i = 1; i <=cadena.length(); i++) {
        String c1 = cadena.substring(i);
        String c2 = cadena.substring(0, i);
        System.out.println(c1 + c2);
        System.out.println(" ");
        
        }
        
        /* String cadena= "puros gatos";
        
        for (int i = 0; i <=cadena.length(); i++) {
        System.out.println(cadena.substring(i));
        }*/
        
        
        
        
    }
    
}
