
package getandset;


public class Getandset {

    
    public static void main(String[] args) {
        
        Obteniendo obj = new Obteniendo();
        Obteniendo obj2 = new Obteniendo();
        Obteniendo obj3 = new Obteniendo();
        obj.setNombre("Oswaldo");
        obj2.setNombre("Susan");
        obj3.setNombre("Diego");
        System.out.println("Nombre objeto1 es:"+obj.getNombre());
        System.out.println("Nombre objeto2 es: "+obj2.getNombre());
        System.out.println("Nombre objeto3 es: "+obj3.getNombre());
        
        obj3.setNombre("Diego Ivan");
        System.out.println("Nombre objeto3 modificado es: "+obj3.getNombre());
        
        
        
        
        
    }
    
}
