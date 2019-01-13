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
public class Carro implements Rueda,Asientos {
    
    public Carro(){
    }

    @Override
    public void avanzar() {
        System.out.println("El carro está avanzando");
    }

    @Override
    public void detener() {
        System.out.println("El carro está detenido");
    }

    @Override
    public void numero_asientos() {
        System.out.println("Numero de asientos del carro son 4");
    }
    
}
