
package granja;


public class Granja {

    
    public static void main(String[] args) {
        
        Mascota[] animales = new Mascota[3];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Cochino();
        
        for(int i=0;i<animales.length;i++){
            animales[i].hablar();        
        }
    }
}
