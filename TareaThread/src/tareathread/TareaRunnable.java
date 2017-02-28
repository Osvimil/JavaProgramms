
package tareathread;


public class TareaRunnable implements Runnable {
    
   
    
    public void Runnable(Runnable target,String nombre){
    
    }
    
    public void run() {
         
         for (int i = 1; i <= 5; i++) {
            
            System.out.println("Nombre: "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    }
    
    
    
}
