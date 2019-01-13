
package herenciauki;


public class Herenciauki {

    
    public static void main(String[] args) {
        
        
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
        
        System.out.println("----------------");
        
        
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
        
        System.out.println("-------------");
       
        
        System.out.println(unam.getFacultad());
        System.out.println(unam.getNombre());
        System.out.println(unam.getApellidos());
        System.out.println(unam.getEdad());
     
    }
    
}
