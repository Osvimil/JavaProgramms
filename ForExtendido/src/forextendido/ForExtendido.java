
package forextendido;

import java.util.ArrayList;


public class ForExtendido {

    
    public static void main(String[] args) {
        
        /*ArrayList <String> equipos = new ArrayList <String>();
        equipos.add("chivas");
        equipos.add("toluca");
        equipos.add("necaxa");
        equipos.add("pumas");
        
        
        System.out.println("Los equipos son: ");
        
        int i=0;
        for(String nombre: equipos){
        System.out.println((i+1) + nombre+" ");
        i++;
        }*/
        
        ArrayList <String> escuelas = new ArrayList<String>();
        escuelas.add("UPIICSA");
        escuelas.add("UPIITA");
        escuelas.add("UPIIBI");
        escuelas.add("ESIME");
        escuelas.add("ESIQUIE");
        System.out.println("Escuelas del IPN: ");
        int contador=0;
        
        for(String nombres: escuelas){
            System.out.println((contador+1+". ")+ nombres+ " ");
            contador++;
        
        }
        
        
    }
    
}
