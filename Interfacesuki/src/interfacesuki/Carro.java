
package interfacesuki;


public class Carro implements Rueda {
    
    public Carro(){
    }
    
    @Override
    public void avanzar(){
        System.out.println("carro avanza en cuatro ruedad");
    }
    
    
    @Override
    public void detenerse(){
        System.out.println("yo me detengo con mecanismo");
    }
}
