
package interfacesuki;


public class Interfacesuki {

    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Bici bici = new Bici();
        
        carro.avanzar();
        carro.detenerse();
        
        bici.avanzar();
        bici.detenerse();
        bici.sentarse();
    }   
}
