/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clason;


public class Avion {
    private int anio;
    private String modelo;
    private String color;
    
    public Avion(){
        
        anio=2010;
        modelo="pointer";
        color="blanco";
    
    }
    public Avion(int anio,String modelo,String color){
        this.anio=anio;
        this.modelo=modelo;
        this.color=color;
    }
    
    public int getAnio(){
    return anio;
    }
    public String getModelo(){
    return modelo;
    }
    public String getColor(){
    return color;
    }
    
    public void start_motor(){
        System.out.println("motor arrancado");
    
    }
    public void stop_motor(){
        System.out.println("motor parado");
    }
    
}
