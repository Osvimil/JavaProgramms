
package hiloacceso;


public class HiloAcceso {

    
    public static void main(String[] args) {
       
        AccesoRunnable ar = new AccesoRunnable();
        Thread t1 = new Thread(ar);
        Thread t2 = new Thread(ar);
        Thread t3 = new Thread(ar);
        Thread t4 = new Thread(ar);
        Thread t5 = new Thread(ar);
        Thread t6 = new Thread(ar);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        
    }
    
}
