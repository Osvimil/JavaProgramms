
package sumaoption;
import javax.swing.*;


public class Sumaoption {

    
    public static void main(String[] args) {
        
        try{
            int numero1,numero2,numero3,resultado;
        String aux;
        
        aux = JOptionPane.showInputDialog("Numero uno");
        numero1 = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog("Numero dos");
        numero2 = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog("Numero 3");
        numero3 = Integer.parseInt(aux);
        
        resultado = numero1+numero2+numero3;
        JOptionPane.showMessageDialog(null,"La suma es:"+resultado,"RESULTADO",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        }catch(Exception e){
            System.out.println("El error es: "+e.getMessage());
        }
        
        
        
        
        /* try{
        int num1,num2,num3,resultado;
        String auxiliar;
        
        auxiliar = JOptionPane.showInputDialog("primer número");
        num1 = Integer.parseInt(auxiliar);
        
        auxiliar = JOptionPane.showInputDialog("segundo número");
        num2 = Integer.parseInt(auxiliar);
        
        auxiliar = JOptionPane.showInputDialog("tercer número");
        num3 = Integer.parseInt(auxiliar);
        
        resultado = num1+num2+num3;
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es:"+resultado,"RESULTADO",JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
        }catch(Exception e){
        System.out.println("El error es: "+e.getMessage());
        }*/
    }  
}
