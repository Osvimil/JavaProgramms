
package grabaarray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Almacenamiento {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fs = new FileOutputStream("datos.obj");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(new Personne("Oswaldo",23));
        os.writeObject(new Personne("Guadalupe",58));
        os.writeObject(new Personne("Alfonso",25));
        os.writeObject(new Personne("Paps",19));
        os.close();
    }
    
}
