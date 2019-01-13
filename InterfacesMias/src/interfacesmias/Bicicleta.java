/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesmias;

/**
 *
 * @author oswaldosaldivar
 */
public class Bicicleta implements Rueda,Asientos {
    
    public Bicicleta(){
    }

    @Override
    public void avanzar() {
        System.out.println("La bici está avanzando");
    }

    @Override
    public void detener() {
        System.out.println("La bici está detenida");
    }

    @Override
    public void numero_asientos() {
        System.out.println("Numero de asiento bici son 1");
    }
    
}
