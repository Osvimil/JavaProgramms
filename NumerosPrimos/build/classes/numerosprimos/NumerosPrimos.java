
package numerosprimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumerosPrimos {

    
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Introduce tu numero limite");
            int num= Integer.parseInt(br.readLine());
            Numeros n = new Numeros();
            n.iniciar(num);
            
        }catch(IOException e){
            System.out.println("Numero introducido invalido");
        }
        
    }
    
}
