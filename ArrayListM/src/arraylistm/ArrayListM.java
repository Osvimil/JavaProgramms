
package arraylistm;

import java.util.HashMap;
import java.util.Map;


public class ArrayListM {

    
    public static void main(String[] args) {
        HashMap<Integer, String> lenguajes = new HashMap<>();
        lenguajes.put(2,"ESPAÑOL");
        lenguajes.put(4,"INGLES");
        lenguajes.put(6,"FRANCES");
        lenguajes.put(1,"RUSO");
        lenguajes.put(8,"ITALIANO");
        lenguajes.put(3,"ALEMAN");
        
        for(Map.Entry<Integer,String> obtener: lenguajes.entrySet()){
            int llave = obtener.getKey();
            String valor = obtener.getValue();
            System.out.println(llave+". "+valor);
        
        }
        /*  HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1, "Toluca");
        map.put(2, "Chivas");
        map.put(3, "Santos");
        map.put(4, "León");
        map.put(5, "Colibries");
        map.put(1, "América");
        
        //String obtener = map.get(1);
        //System.out.println(obtener);
        
        for(Map.Entry<Integer,String> adquirir: map.entrySet()){
        int llave = adquirir.getKey();
        String valor = adquirir.getValue();
        
        System.out.println(llave+ ": "+valor);
        }*/ 
    }
    
}
