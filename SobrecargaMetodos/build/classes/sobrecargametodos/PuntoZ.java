
package sobrecargametodos;


public class PuntoZ extends PuntoY {
    
    int z;
    
    PuntoZ(int x, int y, int z){
        super(x,y);
        this.z=z;    
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("valor z: "+z);
    }
    
}
