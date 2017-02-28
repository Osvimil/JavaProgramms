/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author oswaldosaldivar
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hilo1 = new Procesos("Proceso1");
        Thread hilo2 = new Procesos("Proceso 2");
        
        hilo1.start();
        hilo2.start();
               
    }
    
}
