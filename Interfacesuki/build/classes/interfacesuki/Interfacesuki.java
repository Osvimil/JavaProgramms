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
public class Interfacesuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Bici bici = new Bici();
        
        carro.avanzar();
        carro.detenerse();
        
        bici.avanzar();
        bici.detenerse();
        bici.sentarse();
    }
    
}
