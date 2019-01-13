
package hiloseminario;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TaskTwo extends Thread {
    
    public void run(){
        
        for (int i = -1; i >= -5; i--) {
            
            System.out.println("El número es: "+i);
            try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
            
        }
        
    
    
    }
    
}
