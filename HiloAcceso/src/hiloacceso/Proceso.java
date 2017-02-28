
package hiloacceso;



public class Proceso implements Runnable {
    
    private int total;

    public int getTotal() {
        return total;
    }
    
    

    @Override
    public void run() {
        
        synchronized(this){
            for (int i = 1; i <= 100; i++) {
                total+=i;
                
                
            }
            this.notify();
        
        
        
        }
        
        
    }
    
}
