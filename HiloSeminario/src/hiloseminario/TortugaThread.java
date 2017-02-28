
package hiloseminario;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TortugaThread extends Thread {
    
    public void run(){
    
        int i=0;
        System.out.println("Comienza la turtle");
        while(i<5){
            try {
                Thread.sleep(3000);
                System.out.println("Tortuga...");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                
            }
            i++;
        
        }
        System.out.println("Terminó la tortuga");
                
    }
    
    
    
}
