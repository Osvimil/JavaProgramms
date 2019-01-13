/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiarycaso;
import java.util.Scanner;


public class CambiaryCaso {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero=2056;
        System.out.println("Ingresa NIP: ");
        numero = sc.nextInt();
        
        switch(numero){
        
            case 2056:
                System.out.println("Bienvenido al cajero: ");
                break;
            case 2000:
                System.out.println("Incorrecto");
                break;
            default:
                System.out.println("BANCO BILBAO DEL NORTE DE JAMAICA");       
    }
        
       
        
        /*char letra='w';
        
        switch(letra){
        case 'a':
        System.out.println("letra a");
        break;
        default:
        System.out.println("es otra letra");
        break;
        case 'b':
        System.out.println("letra b");
        break;
        case 'z':
        System.out.println("letra z");
        break;
        }*/
    }
    
}
