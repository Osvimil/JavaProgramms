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
public class AlumnoUAM extends Alumno {
    
    String plantel;
    String ciudad;

    public String getPlantel() {
        return plantel;
    }

    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    public void imprimir(){
        System.out.println("Alumno de la UAM");
    
    }
    
}
