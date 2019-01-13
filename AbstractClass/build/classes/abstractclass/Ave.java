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
public class Ave extends Animal{
    
    public Ave(){
        super();
        setNombre("Ave");
        
    }
    
    
    @Override
    public void moverse(){
        System.out.println("Yo vuelo, soy una ave");
    }
    
}
