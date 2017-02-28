
package hiloseminario;


public class HiloSeminario {

    
    public static void main(String[] args) {
        
        TaskOne uno = new TaskOne();
        TaskTwo dos = new TaskTwo();
        
        uno.start();
        dos.start();   
    }
    
}
