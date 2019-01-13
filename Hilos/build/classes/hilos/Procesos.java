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
public class Procesos extends Thread {
    
    public Procesos(String msg){
        super(msg);
    }
    
    public void run(){
    
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName());
        }
    }
    
}
