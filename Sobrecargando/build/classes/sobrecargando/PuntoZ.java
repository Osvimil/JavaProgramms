
package sobrecargando;


public class PuntoZ extends PuntoY {
    int z;
    
    public void imprimir()
    {
    super.imprimir();
        System.out.println("valor de z: "+z);
    }
    
}
