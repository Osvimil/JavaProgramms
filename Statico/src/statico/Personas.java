
package statico;


public class Personas {
    
    private String nombre;
    private String apellidos;
    private static int miembros=0;
    
    public Personas(String nombre,String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
        miembros++;
        System.out.printf("%s %s, es el número: %d\n",nombre,apellidos,miembros);    
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
    
        return apellidos;
    }
    public int getMiembros(){
    return miembros;
    }
    
    
}
