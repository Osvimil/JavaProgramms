
package grabaarray;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class RecuperaObjeto {
    
    
    public static void main(String[] args) 
            throws FileNotFoundException, IOException, ClassNotFoundException {
        
        FileInputStream fi = new FileInputStream("datos.obj");
        ObjectInputStream os = new ObjectInputStream(fi);
        Personne p = (Personne) os.readObject();
        
        try{
            while(p!=null){
                System.out.println("nombre: "+p.getNombre());
                System.out.println("Edad: "+p.getEdad());
                System.out.println("---------------");
                p = (Personne) os.readObject();
            
                
            }
            
        }catch(EOFException e){      
        }
        os.close();     
    }
    
    
    
}
