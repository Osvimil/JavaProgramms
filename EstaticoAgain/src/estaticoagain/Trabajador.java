
package estaticoagain;


public class Trabajador {
    
    private int edad;
    private String nombre;
    
    public Trabajador(){}
    
    public void setEdad(int edad){
        this.edad = edad;
    
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void mostrarDeInstancia(){
        System.out.println("Edad: "+edad+" Nombre: "+nombre);
    }
    public static void mostrarDeClase(){
        System.out.println("Metodo estatico");
    }
}
