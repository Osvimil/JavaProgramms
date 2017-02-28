/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forextendido;
import java.util.ArrayList;

/**
 *
 * @author oswaldosaldivar
 */
public class ForExtendido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> equipos = new ArrayList <String>();
        equipos.add("chivas");
        equipos.add("toluca");
        equipos.add("necaxa");
        equipos.add("pumas");
        
        
        System.out.println("Los equipos son: ");
        
        int i=0;
        for(String nombre: equipos){       
            System.out.println((i+1) + nombre+" ");
            i++;
        }
        
        
    }
    
}
