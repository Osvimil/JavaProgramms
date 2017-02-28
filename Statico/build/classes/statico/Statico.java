
package statico;


public class Statico {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personas uno = new Personas("Oswaldo","Peralta");
        Personas dos = new Personas("Alfonso","Peralta");
        Personas tres = new Personas("Guadalupe","Saldivar");
        Personas cuatro = new Personas("Paps","Saldivar");
        
        
        System.out.println();
        
        System.out.println(cuatro.getNombre());
        System.out.println(cuatro.getApellidos());
        System.out.println(cuatro.getMiembros());
        
        
        
    }
    
}
