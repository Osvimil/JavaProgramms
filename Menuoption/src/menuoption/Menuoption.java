/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuoption;

import javax.swing.*;


public class Menuoption {

    
    public static void main(String[] args) {
        
        String opcionera;
        int opcion=0;
        do{
            opcionera = JOptionPane.showInputDialog("--MENÚ--\n 1.Opcion 1 \n 2.Opcion 2 \n 3.Salir \n opcion:");
            try{
                opcion = Integer.parseInt(opcionera);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Solo números por favor");
                opcion =0;
            
            }
            switch(opcion){
                case 0:
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Opcion 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Good Bye");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion no valida");
            
            }
        }while(opcion >=0 && opcion !=3);
        
        /*String opcionera;
        int opcion=0;
        do{
        opcionera = JOptionPane.showInputDialog("--MENÚ-- \n 1.Opción 1 \n 2.Opción 2 \n 3.Salir \n opción: ");
        try{
        opcion = Integer.parseInt(opcionera);
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null,"Error paps, solo números");
        opcion=0;
        }
        switch(opcion){
        case 0:
        break;
        case 1:
        JOptionPane.showMessageDialog(null, "opción 1");
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "opción 2");
        break;
        case 3:
        JOptionPane.showMessageDialog(null,"AU REVOIR");
        break;
        default:
        JOptionPane.showMessageDialog(null,"opción no válida");
        
        }
        
        }while(opcion>=0 && opcion != 3);*/
     
    }
    
}
