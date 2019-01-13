
package sobrecarga;


public class Dos extends Uno {
    int valor2;
    
    void imprimir(){
        super.imprimir();
        System.out.println("valor 2: "+valor2);
    }
    
}
