
package pruebaproducto;


public class PruebaProducto {

    
    public static void main(String[] args) {
        
        Libro programacion = new Libro(2000,1500,"Lenguaje C");
        Disco regeton = new Disco(400,350,"Daddy yankee");
        
        System.out.println("Estos son tus articulos comprados: ");
        System.out.println(programacion.imprimirDatos());
        System.out.println(regeton.imprimirDatos());      
    }   
}
