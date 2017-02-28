
package graficosincezero;
import javax.swing.JOptionPane;


public class GraficoSinceZero {

    
    public static void main(String[] args) {
        
        try{
            String numero1 = JOptionPane.showInputDialog("Introduce primer numero");
            String numero2 = JOptionPane.showInputDialog("Introduce segundo numero");

            int n1 = Integer.parseInt(numero1);
            int n2 = Integer.parseInt(numero2);
            int suma = n1+n2;

            JOptionPane.showMessageDialog(null,"La suma es: "+suma,"OMagno",JOptionPane.PLAIN_MESSAGE);
        
        }catch(Exception e){
            System.out.println("La excepcion es: "+e.getMessage());
        
        }
        
             
    }
    
}
