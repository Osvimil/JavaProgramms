
package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Conjuntos {
    //LOS CONJUNTOS NO PERMITEN DUPLICADOS
    // LOS HASHSET NO SE MUESTRAN EN UN ORDEN 
    // LOS TREESET LOS ORDENA 
    
    // empleado clave,nombre, sueldo hacer un CRUD utilizando CONJUNTOS
    
    
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<String>();
       //Set<String> conjunto = new TreeSet<String>();
        conjunto.add("rojo");
        conjunto.add("verde");
        conjunto.add("cafe");
        conjunto.add("negro");
        conjunto.add("blanco");
        conjunto.add("blanco");
        conjunto.add("verde");
        conjunto.add("azul");
        conjunto.add("cafe");
        conjunto.add("negro");
        conjunto.add("blanco");
        conjunto.add("blanco");
        conjunto.add("verde");
        conjunto.add("azul");
        conjunto.add("cafe");
        conjunto.add("verde");
        conjunto.add("azul");
        
        Iterator iterator = conjunto.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            
        }
        
    }
    
}
