
package sobrecarga;

import javax.swing.JOptionPane;


public class Sobrecarga {

    
    public static void main(String[] args) {
        /*Uno u = new Uno();
        Dos d = new Dos();
        Tres t = new Tres();
        
        u.valor1=10;
        
        
        d.valor1=20;
        d.valor2=30;
        
        
        t.valor1=40;
        t.valor2=50;
        t.valor3=60;
        
        
        
        u.imprimir();
        d.imprimir();
        t.imprimir();*/ 
        
        Uno uno  = new Uno();
        Dos dos = new Dos();
        Tres tres = new Tres();
         uno.valor1 = 2000;
         dos.valor1 = 2001;
         dos.valor2 = 2002;
         tres.valor1 = 2003;
         tres.valor2 = 2004;
         tres.valor3 = 2005;
                
         uno.imprimir();
         dos.imprimir();
         tres.imprimir();
    }
    
}
