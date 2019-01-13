
package herenciauki;


public class AlumnoUAM extends Alumno {
    
    private String plantel;
    private String ciudad;

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
