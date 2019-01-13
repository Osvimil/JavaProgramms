
package arraylistr;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Persona{

    private int id;
    private String nombre;
    
    public Persona(int id,String nombre){
        this.id=id;
        this.nombre=nombre;        
    }
    
    public String toString(){
        return "ID: "+id+ ": "+"Nombre es: "+nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}


public class ArrayListR {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona(12,"maria");
        Persona p2 = new Persona(13,"carlos");
        Persona p3 = new Persona(17,"lalo");
        Persona p4 = new Persona(12,"colorado");
        Map<Persona,Integer> map= new LinkedHashMap<Persona,Integer>();
        
        map.put(p1, 21);
        map.put(p2, 1);
        map.put(p3, 32);
        map.put(p4, 2);
        
          for(Persona llave: map.keySet()){
        System.out.println(llave+ ": "+map.get(llave));
        }
        
        Set<Persona> set = new LinkedHashSet<Persona>();
        
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);        
    }   
}
