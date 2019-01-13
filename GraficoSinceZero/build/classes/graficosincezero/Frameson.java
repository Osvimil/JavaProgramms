
package graficosincezero;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frameson extends JFrame {
    private JLabel etiqueta1;
    
    public Frameson(){
        super("Titulo de la barra");
        setLayout(new FlowLayout());
        
        etiqueta1 = new JLabel("Un enunciado X");
        etiqueta1.setToolTipText("Se mostrará");
        add(etiqueta1);
    
    }
    
    public static void main(String[] args) {
        Frameson objeto = new Frameson();
        objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objeto.setSize(300,300);
        objeto.setVisible(true);
    }
    
    
    
}
