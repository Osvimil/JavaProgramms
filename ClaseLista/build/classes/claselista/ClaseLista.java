
package claselista;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class ClaseLista {

    
    public static void main(String[] args) {
        
         List<Persona> datones = new ArrayList<Persona>();
            Random r = new Random();
            Persona temp = null;
            int sumaaltura = 0;
            
            for(int i=0;i<500;i++)
            {
                datones.add(new Persona(i,"Persona "+i,r.nextInt(100)+100));
            }
            Iterator<Persona> it = datones.iterator();
 
            while(it.hasNext())
            {
                temp = it.next();
                System.out.println(temp);
                sumaaltura += temp.getAltura();
            }
 
            System.out.println("La media de altura del conjunto de Personas es: "+sumaaltura/datones.size());
        
    }
    
}
