
package botton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Gui extends JFrame {
    
    private JButton registro;
    private JButton cliente;
    
    public Gui(){
        super("Titulo ventanta");
        setLayout(new FlowLayout());
        
        registro = new JButton("Registro");
        add(registro);
        
        Icon a = new ImageIcon(getClass().getResource("candy1.jpg"));
        Icon b = new ImageIcon(getClass().getResource("chocolate1.jpg"));
        cliente = new JButton("cliente",a);
        cliente.setRolloverIcon(b);
        add(cliente);
        
        HandlerClass handler = new HandlerClass();
        registro.addActionListener(handler);
        cliente.addActionListener(handler);
        
    }
    
    private class HandlerClass implements ActionListener{
        
        
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
            
        
        }
    
    
    }
}
