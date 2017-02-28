/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clason;


public class Clason {

    
    public static void main(String[] args) {
        
        Avion objeto1 = new Avion();
        Avion objeto2 = new Avion(2012,"cryshler","azul");
        
        /*objeto1.anio=2000;
        objeto1.color="green";
        objeto1.modelo="nissan";*/
        
        System.out.println("año carro: "+objeto1.getAnio()+" \ncolor carro: "+objeto1.getColor()+" \nmodelo carro: "+objeto1.getModelo());
        objeto1.start_motor();
        objeto1.stop_motor();
        
        System.out.println("----------------------------");
        
        System.out.println("año segundo carro: "+objeto2.getAnio());
        System.out.println("color segundo carro: "+objeto2.getColor());
        System.out.println("modelo segundo carro: "+objeto2.getModelo());

        
        
        
    }
    
}
