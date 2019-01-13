
package pruebaproducto;


public class Libro extends Producto {
    
    public Libro(double precioVenta, double costoFabrica, String nombreProducto){
        super(precioVenta,costoFabrica,nombreProducto);
    
    }
    
    @Override
    public String imprimirDatos() {
        return "Libro: "+nombreProducto+"\t Precio: $"+precioVenta;
    }
    
}
