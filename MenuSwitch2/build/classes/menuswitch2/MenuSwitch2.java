
package menuswitch2;

import javax.swing.JOptionPane;


public class MenuSwitch2 {

    
    public static void main(String[] args) {
        
        int opcion=0;
        String cadena="";
        do{
         cadena = JOptionPane.showInputDialog("Choisissez une option:\n"
                + "1.Suma\n"
                + "2.Multiplicación\n"
                + "3.Division\n"
                + "4.Salir"
                );
        
        opcion = Integer.parseInt(cadena);
        
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"SUMARAS");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"MULTIPLICARAS");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"DIVIDIRAS");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Saldrás");
        }
        
        }while(opcion!=4);      
    }
    
}
