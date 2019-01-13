
package arraylistp;

import java.util.ArrayList;


public class ArrayListP {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
     
        lista.add(2000);
        lista.add(2002);
        lista.add(2004);
        lista.add(2006);
        lista.add(2008);
        lista.add(2008);
        
        System.out.println("For normal");
        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        //remueve ultimo elemento
        lista.remove(lista.size()-1);
        lista.remove(4);
        
        System.out.println("for each");
        
        for(Integer recorredor:lista){
            System.out.println(recorredor);       
        }
    }   
}
