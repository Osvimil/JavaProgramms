
package grabaarray;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class RecuperarArray {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        DataInputStream ds = new DataInputStream(new FileInputStream("datos2.dat"));
        
        try {
            for (;;) {
                System.out.println(ds.readInt());
            }
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        }
    }    
}
