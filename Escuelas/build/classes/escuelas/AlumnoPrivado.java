/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelas;

/**
 *
 * @author oswaldosaldivar
 */
public class AlumnoPrivado {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private long boleta;
    
    public AlumnoPrivado(String nombre, String apellidos, int edad, long boleta){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.boleta=boleta;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getBoleta() {
        return boleta;
    }

    public void setBoleta(long boleta) {
        this.boleta = boleta;
    }
    
     public void mostrar(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
        System.out.println("Boleta: "+boleta);   
    }    
}
