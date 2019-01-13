/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciauki;

/**
 *
 * @author oswaldosaldivar
 */
public class AlumnoUNAM extends Alumno {
    
    String facultad;

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
    
    public void imprimir(){
    
        System.out.println("Alumno de la UNAM");
    }
    
}
