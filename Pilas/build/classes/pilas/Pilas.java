
package pilas;
 import java.util.Stack;


public class Pilas {
// PUSH POP PEEK EMPTY
    /* 
    PUSH meter nuevos elementos a la pila
    PEEK mostrar ultimo elemento de la pila
    POP sacar elementos de la pila
    EMPTY pila vacía
    
    */
    
    public static void main(String[] args) {
        Stack pila = new Stack();
        
        pila.push("televisa");
        pila.push("azteca");
        pila.push("cadena tres");
        pila.push("tele fórmula");
        pila.push(2000);
        
        System.out.println("último elemento de la pila: "+pila.peek());
        
       
        
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
        
    }
    
}
