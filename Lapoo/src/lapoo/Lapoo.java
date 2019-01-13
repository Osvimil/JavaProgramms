
package lapoo;


public class Lapoo {

    
    public static void main(String[] args) {
        Pelotuki pelota = new Pelotuki();
        System.out.println("El peso es: "+pelota.getPeso());
        System.out.println("El radio es: "+pelota.getRadio());
        pelota.Atrapar();
        pelota.Patear();
    }
    
}
