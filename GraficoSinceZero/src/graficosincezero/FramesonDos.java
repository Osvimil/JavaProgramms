
package graficosincezero;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class FramesonDos extends JFrame {
    private JTextField etiqueta1;
    private JTextField etiqueta2;
    private JTextField etiqueta3;
    private JPasswordField contrasena;
    
    public FramesonDos(){
        super("Mi titulo");
        setLayout(new FlowLayout());
        
        etiqueta1 = new JTextField(10);
        add(etiqueta1);
        
        etiqueta2 = new JTextField("Soy texto");
        add(etiqueta2);
        
        etiqueta3 = new JTextField("Sin editar",20);
        etiqueta3.setEditable(false);
        add(etiqueta3);
        
        contrasena = new JPasswordField("contra123");
        add(contrasena);
        
        manipulador mani = new manipulador();
        
        etiqueta1.addActionListener(mani);
        etiqueta2.addActionListener(mani);
        etiqueta3.addActionListener(mani);
        contrasena.addActionListener(mani);
              
    }
    
     private class manipulador implements ActionListener{
         
        public void actionPerformed(ActionEvent evento){
             String cadena="";
            if(evento.getSource()==etiqueta1)
                cadena=String.format("campo 1: %s", evento.getActionCommand());
            
            else if(evento.getSource()==etiqueta2)
                cadena=String.format("campo 2: %s",evento.getActionCommand());
            
            else if(evento.getSource()==etiqueta3)
                cadena=String.format("campo 3: %s",evento.getActionCommand());
            else if(evento.getSource()==contrasena)
                cadena=String.format("password: %s",evento.getActionCommand());
            
            JOptionPane.showMessageDialog(null,cadena);
                       
        }
               
        
        }
     
     public static void main(String[] args) {
         
         FramesonDos dos = new FramesonDos();
         
         dos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         dos.setSize(300,300);
         dos.setVisible(true);
         
        
    }
    
    
}
