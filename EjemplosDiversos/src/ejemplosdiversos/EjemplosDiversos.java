
package ejemplosdiversos;

import java.util.Scanner;


public class EjemplosDiversos {

    
    public static void main(String[] args) {
        
        /* try{
        Scanner sc = new Scanner(System.in);
        int numerador=0;
        int denominador=0;
        System.out.println("Ingresa numerador");
        numerador = sc.nextInt();
        System.out.println("Ingresa denominador");
        denominador = sc.nextInt();
        
        numerador = numerador/denominador;
        System.out.println("Resultado: "+numerador);
        
        }catch(Exception sipply){
        System.out.println("Mensaje de error es: "+sipply.getMessage());
        }*/
        
        /* Scanner factorial = new Scanner(System.in);
        int numero;
        int auxiliar=1;
        
        System.out.println("Ingresa numero para factorial");
        numero = factorial.nextInt();
        
        while(numero>0){
        auxiliar = auxiliar * numero;
        numero = numero -1;
        }
        System.out.println("Resultado: "+auxiliar);*/
        
        Scanner obj = new Scanner(System.in);
        int pin = 3456;
        int intentos =0;
        
        do{
            System.out.println("Ingresa pin para entrar al banco");
            pin = obj.nextInt();
            
            if(pin == 3456){
                System.out.println("Bienvenido a banamex");
            
            }else{
                System.out.println("ingresa de nuevo tu pin");
                
            }
            intentos++;
        }while(intentos >=4); 
    }  
}
