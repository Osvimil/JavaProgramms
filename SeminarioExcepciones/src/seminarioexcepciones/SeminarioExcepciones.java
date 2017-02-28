
package seminarioexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;



public class SeminarioExcepciones {

   
    public static void main(String[] args){
        
        
        /* try{
        BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        System.out.println("Escribe una palabra: ");
        nombre = ent.readLine();
        System.out.println(nombre);
        }catch(IOException ex){
        System.out.println("error de entrada");
        
        }*/
        
        
        //Las excepiones deben de ir de lo general a lo particular
        //es decir, se sigue un orden
        
        /*int a,b,c;
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa primer numero");
        a=sc.nextInt();
        System.out.println("Ingresa segundo numero");
        b=sc.nextInt();
        c=a/b;
        System.out.println("Cociente de tus numeros es: "+c);
        }catch(ArithmeticException ae){
        System.out.println("No se permite division entre 0");
        
        } catch(InputMismatchException e){
        System.out.println("no hay coincidencia de entrada");
        
        } catch(RuntimeException rte){
        System.out.println("Entrada erronea");
        
        }catch(Exception e){
        System.out.println("Error");
        
        }finally{
        System.out.println("Me ejecuto");
        } */   
        
        int[] arreglo = new int[5];
        Scanner sc = new Scanner(System.in);
        
        try{
            for (int i = 0; i <arreglo.length; i++) {
            System.out.println("dame valor");
            arreglo[i]= sc.nextInt();
            }
            
                System.out.println("Contenido del arreglo es:");
                for (int j = 0; j < arreglo.length; j++) {
                    System.out.println(arreglo[j]);
                    
                }
            
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice de arreglo fuera del limite");
        
        } catch(RuntimeException ed){
            System.out.println("error");
        
        }
        
    }
    
}
