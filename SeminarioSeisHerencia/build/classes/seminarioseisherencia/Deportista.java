
package seminarioseisherencia;


public class Deportista extends Object {
    
    private int registro;
    private String nombre;  
    
    public Deportista(int registro,String nombre){
        this.registro=registro;
        this.nombre=nombre;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void muestra(){
        System.out.println("Nombre del deportista es:"+nombre);
        System.out.println("El registro es: "+registro);
    
    }
    
    
}
