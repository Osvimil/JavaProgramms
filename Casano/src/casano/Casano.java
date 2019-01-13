
package casano;


public class Casano {

    
    public static void main(String[] args) {
       Gato cat = new Gato("Paps",12,1.90);
      
       
       cat.Jugar();
       cat.Comer();
        System.out.println(cat.getEstatura()); 
        System.out.println(cat.getNombre());
        System.out.println(cat.getPeso());
        
        System.out.println("-----------------");
        
        cat.setNombre("Amazon");
        cat.setEstatura(1.20);
        cat.setPeso(200);
        
        System.out.println(cat.getEstatura());
        System.out.println(cat.getNombre());
        System.out.println(cat.getPeso());               
    }
    
}
