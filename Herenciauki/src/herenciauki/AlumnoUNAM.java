
package herenciauki;


public class AlumnoUNAM extends Alumno {
    
    private String facultad;

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
