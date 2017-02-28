/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosmostrar;

import javax.swing.*;
public class Datosmostrar {

    
    public static void main(String[] args) {
        String nombre;
        String auxiliar;
        int codigo;
        double precio;
        
        nombre = JOptionPane.showInputDialog("put your name: ");
        
        auxiliar = JOptionPane.showInputDialog("put the code: ");
        codigo=Integer.parseInt(auxiliar);
        
        auxiliar= JOptionPane.showInputDialog("put the price: ");
        precio= Double.parseDouble(auxiliar);
        
        JOptionPane.showMessageDialog(null,"the name is:"+nombre);
        JOptionPane.showMessageDialog(null,"the code is:"+codigo);
        JOptionPane.showMessageDialog(null,"the price is:"+precio);
       
    }
    
}
