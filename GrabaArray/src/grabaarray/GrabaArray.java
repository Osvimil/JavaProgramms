
package grabaarray;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class GrabaArray {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fos = new FileOutputStream("datos2.dat",false);
        DataOutputStream dos = new DataOutputStream(fos);
        
        int []m = {23,45,12,78,45,11,78,100,100};
        
        for (int i = 0; i <m.length; i++) {
            dos.write(m[i]);
        }
    }
    
}
