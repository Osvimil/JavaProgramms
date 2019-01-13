
package getandset;


public class Obteniendo {
    
    String nombre;
    String empresa;
    int edad;
    String escuela;
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    
    }
    public String getNombre(){
        return nombre;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public String getEmpresa(){
        return empresa;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setEscuela(String escuela){
        this.escuela = escuela;  
    }
    public String getEscuela(){
        return escuela;
    }

}
