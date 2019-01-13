/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjetos;

/**
 *
 * @author oswaldosaldivar
 */
public class Alumnos {
    
    private int boleta;
    private String nombre;
    
    public Alumnos(int boleta,String nombre){
        this.nombre=nombre;
        this.boleta=boleta;
    }
    public void setBoleta(int boleta){
        boleta=boleta;
    
    }
    public int getBoleta(){
        return boleta;
    }
    
    public void setNombre(String nombre){
        nombre=nombre;
    
    }
    public String getNombre(){
    return nombre;
    }
    
    public void muestra(){      
        System.out.println("Boleta:"+boleta);
        System.out.println("Nombre:"+nombre);
    }
    
}
