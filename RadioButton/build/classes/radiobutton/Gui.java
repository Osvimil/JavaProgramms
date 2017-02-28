
package radiobutton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    
    private JTextField texto;
    private Font fuente1;
    private Font fuente2;
    private Font fuente3;
    private Font fuente4;
    private JRadioButton uno;
    private JRadioButton dos;
    private JRadioButton tres;
    private JRadioButton cuatro;
    private ButtonGroup grupo;
    
    
    public Gui(){
        super("titulo");
        setLayout(new FlowLayout());
        texto = new JTextField("Je suis texte",25);
        add(texto);
        
        uno = new JRadioButton("plain",true);
        dos = new JRadioButton("bold",false);
        tres = new JRadioButton("italic",false);
        cuatro = new JRadioButton("bold and italic",false);
        add(uno);
        add(dos);
        add(tres);
        add(cuatro);
        
        grupo = new ButtonGroup();
        grupo.add(uno);
        grupo.add(dos);
        grupo.add(tres);
        grupo.add(cuatro);
        
        fuente1 = new Font("Serif",Font.PLAIN,14);
        fuente2 = new Font("Serif",Font.BOLD,14);
        fuente3 = new Font("Serif",Font.ITALIC,14);
        fuente4 = new Font("Serif",Font.BOLD + Font.ITALIC,14);
        
        texto.setFont(fuente1);
        
        uno.addItemListener(new HandlerClass(fuente1));
        dos.addItemListener(new HandlerClass(fuente2));
        tres.addItemListener(new HandlerClass(fuente3));
        cuatro.addItemListener(new HandlerClass(fuente4));
        
      
 
    }
        private class HandlerClass implements ItemListener{
            private Font fuente;
            public HandlerClass(Font f){
                fuente=f;
                
            }
            
            public void itemStateChanged(ItemEvent event){
              texto.setFont(fuente);
                
            }

    
}
  
    
    
    
}
