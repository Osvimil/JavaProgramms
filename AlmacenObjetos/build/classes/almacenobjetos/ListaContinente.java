
package almacenobjetos;


public class ListaContinente {
    
    private Continente[] contis = new Continente[5];
    private int i=0;
    
    public void agregar(Continente d){
        if(i<contis.length){
            contis[i]=d;
            System.out.println("Continente agregado e indice: "+i);
            i++;
        } 
    }
    
}
