/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalbinario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class DecimalBinario {

    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Coloca no. decimal");
        int numero = Integer.parseInt(reader.readLine());
        StringBuffer buffer = new StringBuffer();
        
        while(numero!=0){
            int digito = numero%2;
            buffer.append(digito);
            numero = numero/2;       
        }
        buffer.reverse();
        System.out.println(buffer);
        
       
       
    }
    
}
