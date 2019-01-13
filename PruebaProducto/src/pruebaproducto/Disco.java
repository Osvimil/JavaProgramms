
package pruebaproducto;


public class Disco extends Producto {
    
    public Disco(double precioVenta, double costoFabrica, String nombreProducto){
        super(precioVenta,costoFabrica,nombreProducto);
    
    }

    @Override
    public String imprimirDatos() {
        return "Disco: "+nombreProducto+"\t Precio: $"+precioVenta;
    }
    
}
