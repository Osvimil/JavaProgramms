
package gettersettersipply;

import javax.swing.JOptionPane;


public class GetterSetterSipply {

    
    public static void main(String[] args) {
        
        Alumno oswaldo = new Alumno();
        oswaldo.setNombre("Oswaldo");
        JOptionPane.showMessageDialog(null, "Nombre de alumno 1: "+oswaldo.getNombre());
        
        
        
        /*oswaldo.edad = 24;
        oswaldo.nombre = "Oswaldo";
        oswaldo.apellido_paterno = "Peralta";
        oswaldo.apellido_materno = "Saldivar";
        oswaldo.semestre = "noveno";
        
        JOptionPane.showMessageDialog(null,"Alumno 1: "+oswaldo.nombre);
        JOptionPane.showMessageDialog(null, "Alumno 1 edad: "+oswaldo.edad);*/
        
        
    }
    
}
