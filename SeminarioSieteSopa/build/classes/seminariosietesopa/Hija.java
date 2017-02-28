/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminariosietesopa;

/**
 *
 * @author oswaldosaldivar
 */
public class Hija extends Abuela {
    
    public Hija(String nombre){
        super(nombre);
        
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Yo soy la hija:");
    
    }
    
}
