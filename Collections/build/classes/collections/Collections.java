
package collections;
import java.util.*;


public class Collections {

   
    public static void main(String[] args) {
        
        //ArrayList<String> paises = new ArrayList<String>();
        ArrayList<String> dependencias = new ArrayList<String>();
        
       
        dependencias.add("SEP");
        dependencias.add("SEGOB");
        dependencias.add("SECTUR");
        dependencias.add("SHCP");
        dependencias.add("SSP");
        
        int i=0;
        System.out.println("Las dependencias son: ");
        
        for(String x:dependencias){
            System.out.println(i+1 +"."+x);
            i++;            
        }
        
        System.out.println("------------");
        
        for(int z=0; z<dependencias.size();z++){
            System.out.println(dependencias.get(z));        
        }

    }   
}
