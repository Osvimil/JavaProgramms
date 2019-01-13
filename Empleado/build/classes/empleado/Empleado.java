
package empleado;


public class Empleado {
    
    private int numEmp;
    private String nombre;
    private double sueldo;

    public Empleado(int numEmp, String nombre, double sueldo) {
        this.numEmp = numEmp;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
