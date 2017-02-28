/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasonas;

/**
 *
 * @author oswaldosaldivar
 */
public class Clasonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase1 classe = new Clase1();
        
        //Clase1 classe2 = new Clase1("Alfon","Peral","Sald");
        
        classe.setNombre("oswaldo");
        classe.setApellido_Paterno("peralta");
        classe.setApellido_Materno("saldivar");
        
        System.out.println("Nombre: "+classe.getNombre());
        System.out.println("Apellido paterno: "+classe.getApellido_paterno());
        System.out.println("Apellido materno: "+classe.getApellido_materno());
        
        
        System.out.println("-----");
        
        //System.out.println("Nombre: "+classe2.getNombre());
       // System.out.println("Apellido 1: "+classe2.getApellido_paterno());
        // System.out.println("Apellido 2: "+classe2.getApellido_materno());

    }
    
}
