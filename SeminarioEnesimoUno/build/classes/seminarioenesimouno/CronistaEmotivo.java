

package seminarioenesimouno;


public class CronistaEmotivo extends Persona implements Cronista, Bailando {

    public CronistaEmotivo(String nombre) {
        super(nombre);
    }

    @Override
    public void gol() {
        System.out.println("gooooool");
    }

    @Override
    public void penalti() {
        System.out.println("peeenaaaltiii");
        
    }

    @Override
    public void bailar() {
        System.out.println("Bailando por la boda de mi sueños");
    }
    
}
