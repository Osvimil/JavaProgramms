/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesconstructores;

/**
 *
 * @author oswaldosaldivar
 */
public class Empleado {
    String nombre="desconocido";
    String apellidos="desconocido";
    int edad=000;
    long telefono=000;
    long codigo=000;
    String direccion="desconocido";
    String correo="desconocido";
    
    Empleado(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    
    }
    
    Empleado(String nombre, String apellidos, long telefono){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
    
    }
    
    Empleado(String nombre, String apellidos, long telefono,long codigo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.codigo=codigo;
    
    }
    
    Empleado(String nombre, String apellidos, long telefono, long codigo, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.codigo=codigo;
        this.edad=edad;
    }
    Empleado(String nombre, String apellidos, long telefono, long codigo, int edad, String direccion){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.codigo=codigo;
        this.edad=edad;
        this.direccion=direccion;
    
    }
    Empleado(String nombre, String apellidos,long telefono, long codigo, int edad, String direccion, String correo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.codigo=codigo;
        this.edad=edad;
        this.direccion=direccion;
        this.correo=correo;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre+" | Apellidos: "+apellidos+" | Telefono: "+telefono
                +"  | Edad: "+edad+" | Código: "+codigo+" | Dirección: "+direccion+" | Correo: "+correo);
        
        
    }
    
}
