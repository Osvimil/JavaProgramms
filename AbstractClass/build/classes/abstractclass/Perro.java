/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author oswaldosaldivar
 */
public class Perro extends Animal {
    
    public Perro(){
        super();
        setNombre("Perro");
    }
    
    
    @Override
    public void moverse(){
        System.out.println("Camino en cuatro patas");
    }
    
}
