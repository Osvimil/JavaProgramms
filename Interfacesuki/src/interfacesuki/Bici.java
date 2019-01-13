
package interfacesuki;


public class Bici implements Rueda,Silla {
    
    public void avanzar(){
        
        System.out.println("yo bici me muevo");
    }
    public void detenerse(){
        System.out.println("yo bici freno con frenos");
    }
    
    public void sentarse(){
        System.out.println("Solo un asiento hay");
    }
}
