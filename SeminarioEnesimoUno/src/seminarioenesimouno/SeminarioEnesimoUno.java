

package seminarioenesimouno;


public class SeminarioEnesimoUno {

    
    public static void main(String[] args) {
        
        CronistaAburrido orvañanos = new CronistaAburrido("Raul Orvañanos");
        CronistaEmotivo bermudez = new CronistaEmotivo("El perro bermudez");
        
        
        System.out.println("El cronista cuyo nombre es: "+orvañanos.getNombre());
        System.out.println("grita gol comme ca: ");
        orvañanos.gol();
        System.out.println("Y penalit asi:");       
        orvañanos.penalti();
        System.out.println("----------");
        
        System.out.println("El cronista cuyo nombre es: "+bermudez.getNombre());
        System.out.println("grita gol asi: ");
        bermudez.gol();
        System.out.println("grita penal asi: ");
        bermudez.penalti();
        System.out.println("y baila así");
        bermudez.bailar();
        
        
    }
    
}
