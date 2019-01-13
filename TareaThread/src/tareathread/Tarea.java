

package tareathread;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Tarea extends Thread {
    
    public Tarea(String nombre){
        super(nombre);    
    }
    
    public void run(){
    
        for (int i = 1; i <= 100; i++) {
            
            System.out.println("Nombre: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    
    }
    
}
