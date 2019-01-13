/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denuevo;

/**
 *
 * @author oswaldosaldivar
 */
public class Objeto {
    int ancho;
    int alto;
    float radio;
    String nombre;
    
    public Objeto(){
        this.ancho=100;
        this.alto=100;
        this.radio=12.45f;
    
    }
    
    public void cambiarValores(int cambiarlos){
        this.ancho=cambiarlos;
        this.alto=cambiarlos;
    
    }
    
    public void Imprimir(){
        System.out.println("Anchura: "+this.ancho);
        System.out.println("Altura: "+this.alto);
    }
    
}
