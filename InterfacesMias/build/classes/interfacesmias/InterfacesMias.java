/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmias;


public class InterfacesMias {

   
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bici = new Bicicleta();
        
        carro.avanzar();
        bici.avanzar();
        
        carro.detener();
        bici.detener();
        
        carro.numero_asientos();
        bici.numero_asientos();
    }
    
}
