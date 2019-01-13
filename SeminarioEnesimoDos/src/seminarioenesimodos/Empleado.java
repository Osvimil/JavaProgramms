
package seminarioenesimodos;


public abstract class  Empleado implements Persona,ParticipanteVaca {
    
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private int monto;
    private int participante;

    
    public void obtenerApellidoPaterno(String a_paterno) {
        this.a_paterno=a_paterno;
    }

    
    public void obtenerApellidoMaterno(String a_materno) {
        this.a_materno=a_materno;
    }

    
    public void obtenerNombre(String nombre) {
        this.nombre=nombre;
    }

    
    public void aportarMonto(int monto) {
        this.monto=monto;
    }

    
    public void obtenerNumeroParticipante(int participante) {
         this.participante=participante;
    }
    
}
