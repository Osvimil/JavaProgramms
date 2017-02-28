/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesuki;

/**
 *
 * @author oswaldosaldivar
 */
public class Bici implements Rueda,Silla {
    
    public void avanzar(){
        
        System.out.println("yo bici me muevo");
    }
    public void detenerse(){
        System.out.println("yo bici freno con frenos");
    }
    
    public void sentarse(){
        System.out.println("Solo un asiento hay");
    }
}
