
package sobrecargando;

public class Sobrecargando {

   
    public static void main(String[] args) {
        
        PuntoX equis = new PuntoX();
        PuntoY ye = new PuntoY();
        PuntoZ zeta = new PuntoZ();
        
        equis.x=20;
        ye.x=30;
        ye.y=60;
        zeta.x=100;
        zeta.y=200;
        zeta.z=400;
        
        equis.imprimir();
         ye.imprimir();
        zeta.imprimir();
    
    }
    
}
