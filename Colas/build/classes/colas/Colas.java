
package colas;
import java.util.LinkedList;

public class Colas {

    
    public static void main(String[] args) {
        LinkedList cola = new LinkedList();
        
        for(int i=0; i<10; i++)
            
            cola.offer(i);
            while(cola.peek()!=null){
            System.out.println(cola.poll());
        }
            
            // PUSH 10 al 1
            // OFFER 1 al 10
        
        
        
        
    }
    
}
