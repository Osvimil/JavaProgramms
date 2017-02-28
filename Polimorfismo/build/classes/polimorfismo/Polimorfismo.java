/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author oswaldosaldivar
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        Oso oso = new Oso();
        Pez pez = new Pez();
        Perico perico = new Perico();
        
        animal.mover();
        oso.mover();
        pez.mover();
        perico.mover();
    }
    
}
