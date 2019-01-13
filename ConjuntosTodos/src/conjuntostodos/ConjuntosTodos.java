
package conjuntostodos;

import java.util.ArrayList;


public class ConjuntosTodos {

    
    public static void main(String[] args) {
        
        
        
        ArrayList<String> escuelas = new ArrayList<String>();
        
        escuelas.add("UNAM");
        escuelas.add("IPN");
        escuelas.add("UVM");
        escuelas.add("LA SALLE");
        System.out.println(escuelas.get(1));
        System.out.println("-----");
        
        /*for(int i=0; i<escuelas.size();i++){
        System.out.println(escuelas.get(i));
        }*/
        
        //escuelas.remove(1); 
        escuelas.remove(escuelas.size()-1);
        for(String recorredor: escuelas){
            System.out.println(recorredor);
        }               
    }
    
}
