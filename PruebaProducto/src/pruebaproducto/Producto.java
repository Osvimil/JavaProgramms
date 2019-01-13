
package pruebaproducto;


public abstract class Producto {
    
    protected double precioVenta;
    protected double costoFabrica;
    protected String nombreProducto;
    
    public Producto(double precioVenta, double costoFabrica, String nombreProducto){
        this.precioVenta = precioVenta;
        this.costoFabrica = costoFabrica;
        this.nombreProducto = nombreProducto;
    }   
    public abstract String imprimirDatos();   
}
