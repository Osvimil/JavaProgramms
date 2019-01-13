
package sobrecarga;


public class Sobrecarga {

    
    public static void main(String[] args) {
        Uno u = new Uno();
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
        t.imprimir();
    }
    
}
