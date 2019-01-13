
package sobrecargametodos;


public class PuntoY extends PuntoX {
    
    int y;
    
    PuntoY(int x, int y){
        super(x);
        this.y=y;    
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("valor y: "+y);
    
    }
    
    
}
