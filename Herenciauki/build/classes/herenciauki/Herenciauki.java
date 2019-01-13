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
public class Herenciauki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alumno = new Alumno();
        
        System.out.println(alumno.getApellidos());
         System.out.println(alumno.getNombre());
        System.out.println(alumno.getEdad());
        
        AlumnoIPN ipn = new AlumnoIPN();
        ipn.setBoleta(2020202020);
        ipn.setMaterias("filosofia");
        ipn.setNom_escuela("upiicsa");
        ipn.setNombre("oswaldo");
        ipn.setApellidos("peralta saldivar");
        ipn.setEdad(22);
        //ipn.getNombre();
        System.out.println(ipn.getMaterias());
        System.out.println(ipn.getBoleta());
        System.out.println(ipn.getNom_escuela());
        System.out.println(ipn.getNombre());
        System.out.println(ipn.getApellidos());
        System.out.println(ipn.getEdad());
        
        AlumnoUNAM unam = new AlumnoUNAM();
        
        unam.setFacultad("politicas");
        unam.setNombre("chela");
        unam.setApellidos("de la loza");
        unam.setEdad(22);
        
        System.out.println(unam.getFacultad());
        System.out.println(unam.getNombre());
        System.out.println(unam.getApellidos());
        System.out.println(unam.getEdad());
        
        
        
        
    }
    
}
