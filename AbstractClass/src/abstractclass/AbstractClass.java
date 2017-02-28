
package abstractclass;

public class AbstractClass {

    
    public static void main(String[] args) {
        
        
        Animal perro = new Perro();
        Ave ave = new Ave();
        Animal tortuga = new Tortuga();
        
        ave.comer();
        ave.moverse();
        System.out.println("-----------------");
       
        
        perro.comer();
        perro.moverse();
        System.out.println("-----------------");
        
        tortuga.comer();
        tortuga.moverse();
        System.out.println("-----------------");
        
    }
    
}
