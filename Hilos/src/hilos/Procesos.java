
package hilos;


public class Procesos extends Thread {
    
    public Procesos(String msg){
        super(msg);
    }
    
    public void run(){
        
        int y=1;
    
        for (int i = 0; i < 20; i++) {
            System.out.println(y+" "+this.getName());
            y++;
        }
    }
    
}
