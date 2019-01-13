
package temperaturascollection;

import java.util.ArrayList;
import java.util.Scanner;


public class TemperaturasCollection {
    
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> lista = new ArrayList<Double>();

    
    public static void main(String[] args) {
        
        int opcion=0;
        double temperatura=0.0;
        
        
        do{
            
            System.out.println("Elige opcion");
            System.out.println("1. Dar temperatura");
            System.out.println("2. Promedio temperaturas");
            System.out.println("3. Mostrar Temperaturas");
            System.out.println("4. Salir");
            
            switch(opcion){
                case 1:
                    System.out.println("Dame la temperatura");
                    temperatura = sc.nextDouble();
                    agregarTemperatura(temperatura);
                    
                break;
                
                case 2:
                    temperaturaMedia();
                break;
                
                case 3:
                    mostrarTemperaturas();
                break;
                
                case 4:
                    System.out.println("BYE");
                break;
                
                default:
                    System.out.println("Opcion inválida");
            
            
            }
        
        }while(opcion!=4);
        
    }

    private static void agregarTemperatura(double temperatura) {
        lista.add(temperatura);
    }

    private static void temperaturaMedia() {
        double promedio=0.0;
        double suma=0.0;
        
        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i));
            suma+=lista.get(i);
                        
        }
        promedio = suma/lista.size();
        System.out.println("El promedio es: "+promedio);
     
    }

    private static void mostrarTemperaturas() {
        for (int i = 0; i <lista.size(); i++) {
            System.out.println("Los elementos insertados son:"+lista.get(i));
            
        }
    }
    
}
