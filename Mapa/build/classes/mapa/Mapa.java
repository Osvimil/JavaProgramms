
package mapa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Mapa {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Map<String,String> mapas = new HashMap<String,String>(); //no importa el orden
        Map<String,String> mapas = new TreeMap<String,String>(); //los ordena
        
        mapas.put("gato", "animal domestico");
        mapas.put("perro", "animal tambien domestico");
        mapas.put("delfin", "animal casi inteligente");
        System.out.println("ambos...");
        System.out.println("ambos...");
        
        Iterator it = mapas.entrySet().iterator();   //Indice o apuntador
        
        while(it.hasNext()){ 
            System.out.println(it.next());
        
        }
        
        System.out.println("LAS CLAVES SON: ");
        it = mapas.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("LOS VALORES SON: ");
        
        it= mapas.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        
        }
        
        System.out.println("cambio de definicion");
        mapas.put("gato", "gato cambiado");
        System.out.println(mapas.get("gato"));
                    
        
        
    }
    
}
