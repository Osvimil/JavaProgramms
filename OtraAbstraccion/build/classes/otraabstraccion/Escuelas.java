/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otraabstraccion;

/**
 *
 * @author oswaldosaldivar
 */
public abstract class Escuelas {
    private String nombre;
    
    Escuelas(){}
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public abstract void tipo_escuela();
    
    public void nombreson(){
        System.out.println("La escuela es: "+nombre);
    }
    
    
    
}
