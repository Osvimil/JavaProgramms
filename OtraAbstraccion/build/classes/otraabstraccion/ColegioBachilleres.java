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
public class ColegioBachilleres extends Escuelas {
    
    ColegioBachilleres(){
    
    super();
    setNombre("Colegio de Bachilleres");
    }

    @Override
    public void tipo_escuela() {
        System.out.println("Escuela tipo nivel medio superior");
    }
    
}
