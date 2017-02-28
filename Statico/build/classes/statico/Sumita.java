/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statico;

/**
 *
 * @author oswaldosaldivar
 */
public class Sumita {
    
    private int suma;
    private final int NUMERO;
    
    public Sumita(int x){
        NUMERO=x;
    }
    
    public void agregar(){
    
        suma+=NUMERO;
    }
    
    
    @Override
    public String toString(){
    
        return String.format("suma = %d\n ", suma);
    }
    
   
    
 public static void main(String[] args) {
        Sumita suma = new Sumita(5);
        
        for (int i = 0; i < 5; i++) {
            suma.agregar();
            System.out.printf("%s",suma);
            
        }
    }
}







