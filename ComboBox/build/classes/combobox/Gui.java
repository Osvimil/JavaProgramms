
package combobox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    private JComboBox caja;
    private JLabel foto;
    
    private static String[] nombre_archivo = {"js.png","vs.png"};
    
    private Icon[] pictures = {new ImageIcon(getClass().getResource(nombre_archivo[0])),
        new ImageIcon(getClass().getResource(nombre_archivo[1]))};
    
    
    public Gui(){
        super("Imagenes");
        setLayout(new FlowLayout());
        caja = new JComboBox(nombre_archivo);
        
        caja.addItemListener(
                new ItemListener(){
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange()==ItemEvent.SELECTED)
                            foto.setIcon(pictures[caja.getSelectedIndex()]);
                    }
                }
        
        ); 
        
        add(caja);
        foto = new JLabel(pictures[0]);
        add(foto);
    }
    
}
