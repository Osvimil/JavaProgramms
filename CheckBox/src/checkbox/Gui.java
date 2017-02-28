
package checkbox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Gui extends JFrame{
    
    private JTextField campo;
    private JCheckBox cheque1;
    private JCheckBox cheque2;
    
    
    public Gui(){    
        super("titulo");
        setLayout(new FlowLayout());
        
        campo = new JTextField("enunciado",20);
        campo.setFont(new Font("Serif",Font.PLAIN,14));
        add(campo);
        
        cheque1 = new JCheckBox("bold");
        cheque2 = new JCheckBox("italic");
        add(cheque1);
        add(cheque2);
       HandlerClass ch = new HandlerClass();
       cheque1.addItemListener(ch);
       cheque2.addItemListener(ch);
    }
   
    private class HandlerClass implements ItemListener{
        
        public void itemStateChanged (ItemEvent event){
            Font fuente = null;
            
            if(cheque1.isSelected() && cheque2.isSelected()){
                fuente = new Font("Serif",Font.BOLD + Font.ITALIC,14);
            
            }
            else if(cheque1.isSelected()){
                fuente = new Font("Serif",Font.BOLD,14);
            
            }
            else if(cheque2.isSelected()){
                fuente = new Font("Serif",Font.ITALIC,14);
            
            }
            else{
                fuente = new Font("Serif",Font.PLAIN,14);
                
            }
            campo.setFont(fuente);
        }


}
    
}
