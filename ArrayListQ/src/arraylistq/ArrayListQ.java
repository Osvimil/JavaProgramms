
package arraylistq;

import static java.lang.String.valueOf;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ArrayListQ {

  
    public static void main(String[] args) {
        
        Set<String> cadena = new TreeSet<String>();
        if(cadena.isEmpty()){
            System.out.println("No hay elementos aún");
        }
        cadena.add("MORELIA");
        cadena.add("CHIVAS");
        cadena.add("TOLUCA");
        cadena.add("PUMAS");
        cadena.add("PUEBLA");
        cadena.add("TIJUANA");
        cadena.add("AMERICA");
        cadena.add("TOROS NEZA");
        
        if(!cadena.contains("MONTERREY")){
            cadena.add("MONTERREY");      
        }else{
            System.out.println("Ya existe");
        }
        
        if(!cadena.contains("TOLUCA")){
            cadena.add("TOLUCA");      
        }else{
            System.out.println("Ya existe");
        }
        
        if(!cadena.contains("TIGRES")){
            cadena.add("TIGRES");      
        }else{
            System.out.println("Ya existe");
        }
        
        int contador=0;
        for(String recorredor: cadena){          
            System.out.println(contador+1+". "+recorredor); 
            contador++;
        }
        Set<String> cadena2 = new TreeSet<String>();
        Set<String> interseccion = new HashSet<String>(cadena);
        
        cadena2.add("PUEBLA");
        cadena2.add("LEON");
        cadena2.add("TIGRES");
        cadena2.add("MONTERREY");
        cadena2.add("VERACRUZ");
        cadena2.add("LOBOS BUAP");
        
        System.out.println(interseccion);
        interseccion.retainAll(cadena2);
        System.out.println(interseccion);
        
        
        Set<String> diferencia = new HashSet<String>(cadena);
        diferencia.removeAll(cadena2);
        System.out.println(diferencia);
        
        
        /*
        
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
        set2.add("IMSS");
        set2.add("PEMEX");
        
        System.out.println(interseccion);
        
        interseccion.retainAll(set2);
        System.out.println(interseccion);
       
        //DIFERENCIA
        
        Set<String> diferencia = new HashSet<String>(cadena2);
        diferencia.removeAll(set2);
        System.out.println(diferencia);*/     
    }
    
}
