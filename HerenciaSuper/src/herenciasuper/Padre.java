/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasuper;

/**
 *
 * @author oswaldosaldivar
 */

// EL MODIFICADOR DE ACCESO PROTECTED ES VISIBLE PARA LAS CLASES HEREDADAS DENTRO DEL MISMO PACKAGE
public class Padre extends Object {
    
    private String nombre;
    
    public Padre(String nombre){
        this.nombre = nombre;      
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    
    }
    public String getNombres(){
        return nombre;
    }
    
    public void caminar(){
        System.out.println("Padre camina");
    
    }
    protected void comer(){
        System.out.println("Padre come");
    
    }
    private void trabajar(){
        System.out.println("Padre trabaja");
    
    }
    
}
