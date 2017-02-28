/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiloseminario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oswaldosaldivar
 */
public class LiebreThread implements Runnable {
    
    public void run(){
        int i=0;
        
        System.out.println("La liebre comienza");
        while(i<5){
            try {
                Thread.sleep(2000);
                System.out.println("Liebre");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }        
            i++;
        }
        System.out.println("Terminó la liebre");
    
    }
    
}
