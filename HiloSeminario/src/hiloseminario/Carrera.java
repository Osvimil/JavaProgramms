
package hiloseminario;


public class Carrera {
    
    public static void main(String[] args) {
        TortugaThread t1 = new TortugaThread();
        LiebreThread l1 = new LiebreThread();
        Thread t2 = new Thread(l1);
        t1.start();
        t2.start();
    }
    
}
