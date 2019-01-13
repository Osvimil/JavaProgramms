package abstractclass;

public class AbstractClass {

    
    public static void main(String[] args) {
        
        //Animal perro = new Animal(); Como es una clase abstracta, no puedo instanciarla
        Ave ave = new Ave (); 
        Perro perro = new Perro();
        Tortuga tortuga = new Tortuga();
        
        ave.comer();
        ave.actividad();
        ave.moverse();
        
        perro.moverse();
        perro.comer();
        perro.actividad();
        tortuga.moverse();
        tortuga.comer();
        tortuga.actividad();
        
        
        /* Animal perro = new Perro(); //Perro perro = new Perro();
        Ave ave = new Ave();  // Animal ave = new Ave();
        Animal tortuga = new Tortuga(); // Tortuga tortuga = new Tortuga();
        
        
        ave.comer();
        ave.moverse();
        System.out.println("-----------------");
        
        
        perro.comer();
        perro.moverse();
        System.out.println("-----------------");
        
        tortuga.comer();
        tortuga.moverse();
        System.out.println("-----------------");*/
        
        
        
        /* Ave piolin = new Ave();
        Perro dog = new Perro();
        Tortuga tor = new Tortuga();
        
        piolin.comer();
        piolin.moverse();
        System.out.println("------");
        dog.comer();
        dog.moverse();
        System.out.println("-------");
        tor.comer();
        tor.moverse();
        System.out.println("-------");*/
        
    }   
}
