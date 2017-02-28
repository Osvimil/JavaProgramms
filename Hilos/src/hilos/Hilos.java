
package hilos;


public class Hilos {

    
    public static void main(String[] args) {
        Thread hilo1 = new Procesos("Proceso1");
        Thread hilo2 = new Procesos("Proceso 2");
        
        hilo1.start();
        hilo2.start();
               
    }
    
}
