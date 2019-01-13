/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasuper;

/**
 *
 * @author oswaldosaldivar
 */
public class Hijo extends Padre {
    
    public Hijo(String nombre){
        super(nombre);
    }

    @Override
    public void caminar() {
        //super.caminar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("El hijo camina");
    }
    public void caminar(String s1){
        System.out.println("El hijo camina en: "+s1);
    
    }
    public void caminar(double d1){
        System.out.println("El hijo camina "+d1+" metros");
    
    }
    
    
    
}
