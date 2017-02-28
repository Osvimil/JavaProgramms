
package arraylistq;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ArrayListQ {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set<String> cadena = new HashSet<String>(); //NO MUESTRO EN ORDEN
        Set<String> cadena1 = new LinkedHashSet<String>(); //MUESTRO COMO FUERON INGRESADOS
        Set<String> cadena2 = new TreeSet<String>(); //MUESTRO EN UN ORDEN ALFABETICO
        
        if(cadena2.isEmpty()){
            System.out.println("No hay dependencias registradas aún");
        }
        cadena2.add("SCHP");
        cadena2.add("SFP");
        cadena2.add("ISSSTE");
        cadena2.add("IMSS");
        cadena2.add("SEGOB");
        cadena2.add("SE");
        cadena2.add("SECTUR");
        cadena2.add("IMSS");
        cadena2.add("ISSSTE");
        
        if(cadena2.isEmpty()){
            System.out.println("no hay dependencias");
        
        }
        
        System.out.println(cadena2);
        System.out.println("/////////");
        
        for(String dependencias: cadena2){
            System.out.println(dependencias);
            
        }
        
        if(cadena2.contains("PEMEX")){
            System.out.println("dependencias ya registrada");
        }
        if(cadena2.contains("IMSS")){
            System.out.println("dependencias ya registrada");
        }
        if(cadena2.contains("SRE")){
            System.out.println("dependencias ya registrada");
        }
        
        //INTERSECCION
        
        Set<String> set2 = new TreeSet<String>();
        Set<String> interseccion = new HashSet<String>(cadena2);
        
        set2.add("MEXICO");
        set2.add("COLOMBIA");
        set2.add("EUA");
        set2.add("BRASIL");
        set2.add("CHINA");
        set2.add("ITALI");
        set2.add("ISSSTE");
        
        System.out.println(interseccion);
        interseccion.retainAll(set2);
        System.out.println(interseccion);
        
        //DIFERENCIA
        
        Set<String> diferencia = new HashSet<String>(cadena2);
        diferencia.removeAll(set2);
        System.out.println(diferencia);
        
    }
    
}
