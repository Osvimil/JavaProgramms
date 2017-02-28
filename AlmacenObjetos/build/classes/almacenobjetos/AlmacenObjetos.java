
package almacenobjetos;


public class AlmacenObjetos {

   
    public static void main(String[] args) {
       ListaContinente lc = new ListaContinente();
       Continente con = new Continente();
       America a = new America();
       Europa e = new Europa();
       
       lc.agregar(con);
       lc.agregar(a);
       lc.agregar(e);
           
    }
    
}
