
package menuswitch;
import java.util.*;
import javax.swing.JOptionPane;

public class MenuSwitch {

    
    public static void main(String[] args) {
        
        
        int estado;
        
        do{
        estado = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1.Prendido \n2.Apagado"));
        switch(estado){   
        case 1:
        JOptionPane.showMessageDialog(null,"Prendido");
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "Apagado");
        break;
        default:
        JOptionPane.showMessageDialog(null, "No mames");
    }
        
        }while(estado!=2);
        
        
        
        
    }
    
}
