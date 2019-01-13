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
public class AlumnoIPN extends Alumno {
    
    private long boleta;
    private String nom_escuela;
    private String materias;

    public long getBoleta() {
        return boleta;
    }

    public void setBoleta(long boleta) {
        this.boleta = boleta;
    }

    public String getNom_escuela() {
        return nom_escuela;
    }

    public void setNom_escuela(String nom_escuela) {
        this.nom_escuela = nom_escuela;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
    
    
    
    public void imprimir(){
        System.out.println("Alumno del IPN");
    }
    
    
}
