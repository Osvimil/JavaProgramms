/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasonas;

/**
 *
 * @author oswaldosaldivar
 */
public class Clase1 {
    
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    
    /*Clase1(){
    }*/
    
   /*Clase1(String nombre,String apellido_p, String apellido_m){
        this.nombre=nombre;
        this.apellido_paterno=apellido_p;
        this.apellido_materno=apellido_m;
    
    }*/
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    
    }
    public void setApellido_Paterno(String apellido1){
        this.apellido_paterno=apellido1;
    
    }
    public void setApellido_Materno(String apellido2){
        this.apellido_materno = apellido2;
    
    }
    public String getNombre(){
    return nombre;
    }
    public String getApellido_paterno(){
    return apellido_paterno;
    }
    public String getApellido_materno(){
    return apellido_materno;
    }
    
}
