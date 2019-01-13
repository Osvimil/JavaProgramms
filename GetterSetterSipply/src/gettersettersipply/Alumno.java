
package gettersettersipply;


public class Alumno {
    
    //Atributos de la clase Alumno
    //Variables 
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String semestre;
    private int edad;
    
    
    //METODOS GET Y SET
    // GET --> OBTENER DATOS DE LOS ATRIBUTOS
    // SET --> MODIFICAR/ALTERAR DATOS DE LOS ATRIBUTOS
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    
 
}
