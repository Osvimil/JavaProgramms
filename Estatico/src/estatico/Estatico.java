
package estatico;


public class Estatico {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseEstatica c1= new ClaseEstatica();
        ClaseEstatica c2 = new ClaseEstatica();
        ClaseEstatica c3 = new ClaseEstatica();
        
        c1.x++;
        c2.x++;
        
        System.out.println("c1: "+c1.x);
        System.out.println("c2: "+c2.x);
        
        c1.xcompartida++;
        c2.xcompartida++;
        c3.xcompartida++;
        
        //System.out.println("c2: "+c1.xcompartida);
        
        
    }
    
}
