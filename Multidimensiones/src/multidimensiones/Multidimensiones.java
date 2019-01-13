/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multidimensiones;
import java.util.Arrays;
/**
 *
 * @author oswaldosaldivar
 */
public class Multidimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[][] = new int [5][3];
        
        for(int x=0;x<arreglo.length;x++){
            
            for(int y=0;y<arreglo[x].length;y++){
                arreglo[x][y]= x+y;
            
            }
            System.out.println(Arrays.toString(arreglo[x]));
        
        }
    }
    
}

/*
String arreglo[]={"un","deux","trois"};
        
        
         for(int o=0;o<arreglo.length;o++){
             
             System.out.println("["+o+"]"+arreglo[o]);
         
         }

*/
