
package arraylistn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class ArrayListN {

    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        
        //testMap(hashMap); //Ordena de acuerdo al integer y no permite valores duplicados
        //testMap(linkedHashMap); //Muestra los valores conforme fueron ingresados y no permite duplicados
        testMap(treeMap); //Muestra los valores de forma ordenada de acuerdo al integer y no permite publicados
        
    }
    
    public static void testMap(Map<Integer,String> map){
        map.put(21, "CAROLINA");
        map.put(20, "SOFIA");
        map.put(22, "VALERIA");
        map.put(23,"FABIOLA");
        map.put(25, "DANIELA");
        map.put(19, "DIANSANELA");
        map.put(27, "MARIA");
        map.put(19, "NORMA");
        
        for(Integer llave: map.keySet()){
            String valor = map.get(llave);
            System.out.println(llave+ ": "+valor);
        
        }
        
    
    }
    
}
