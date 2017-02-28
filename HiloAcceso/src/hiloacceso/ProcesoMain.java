
package hiloacceso;


public class ProcesoMain {
    
    public static void main(String[] args) {
        
        Proceso p = new Proceso();
        Thread t1 = new Thread(p);
        
        t1.start();
        
        synchronized(t1){
            
            try{
            t1.wait(3000);
        
        }catch(InterruptedException e){
            e.printStackTrace();        
        }       
        }
        System.out.println("La suma es: "+p.getTotal());
        
        
    }
    
}
