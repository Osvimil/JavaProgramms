/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author oswaldosaldivar
 */
public class Metodos {

    
    public static void main(String[] args) {
        
        Puntos warever = new Puntos();
        
        warever.variable1=10;
        warever.variable2=20;
        
        warever.imprimir();
        //warever.suma();
        System.out.println("la suma es: "+warever.suma());
    }
    
}
