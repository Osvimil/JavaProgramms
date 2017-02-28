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
public class AlumnoPublico {
        public String nombre;
        public String apellidos;
        public int boleta;
        public int edad;
        public float promedio;
    
    public AlumnoPublico(String nombre,String apellidos, int boleta,int edad,float promedio){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.boleta=boleta;
        this.edad=edad;
        this.promedio=promedio;    
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

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public void mostrar(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Boleta: "+boleta);
        System.out.println("Edad: "+edad);
        System.out.println("Promedio: "+promedio);
    
    }
    
    
   
}
