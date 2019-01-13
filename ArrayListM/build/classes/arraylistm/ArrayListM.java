
package arraylistm;

import java.util.HashMap;
import java.util.Map;


public class ArrayListM {

    
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1, "Toluca");
        map.put(2, "Chivas");
        map.put(3, "Santos");
        map.put(4, "León");
        map.put(5, "Colibries");
        map.put(1, "América");
        
        /*String obtener = map.get(1);
        System.out.println(obtener);*/
        
        for(Map.Entry<Integer,String> adquirir: map.entrySet()){
           int llave = adquirir.getKey();
           String valor = adquirir.getValue();
           
            System.out.println(llave+ ": "+valor);
        }       
    }
    
}
