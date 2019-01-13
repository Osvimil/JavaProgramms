/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classis;

/**
 *
 * @author oswaldosaldivar
 */
public class Classis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clasePublica cp = new clasePublica();
        clasePrivada cpp = new clasePrivada();
        
         System.out.println(cp.cadena);
        System.out.println(cp.numero);
        
        cp.cadena="modificando la cadena publica";
        cp.numero=1899;
        
        System.out.println(cp.cadena);
        System.out.println(cp.numero);
        
        System.out.println(cpp.getCadena());
        System.out.println(cpp.getNumero());
        
        cpp.setCadena("cadenon");
        cpp.setNumero(2000);
        
        System.out.println(cpp.getCadena());
        System.out.println(cpp.getNumero());
        
    }
    
}
