/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otraabstraccion;

/**
 *
 * @author oswaldosaldivar
 */
public class Unam extends Escuelas {
    
    Unam(){
    super();
    setNombre("UNAM");
    }

    @Override
    public void tipo_escuela() {
        System.out.println("Escuela tipo universidad autónoma");
    }
    
}
