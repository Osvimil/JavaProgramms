
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
        
        /*GuadalupeReyes gr = new GuadalupeReyes();
        Navidad n = new Navidad();
        NocheBuena nb = new NocheBuena();*/
        
        Navidad navidad[] = new Navidad[2];
        navidad[0]= new GuadalupeReyes();
        navidad[1] = new NocheBuena();
        
        for(int z=0;z<2;z++){
        navidad[z].fiesta();
        
        }
        
        /*n.fiesta();
        System.out.println();
        gr.fiesta();
        System.out.println();
        nb.fiesta();
        */
        System.out.println();
        Human humano = new Human();
        Navidad navidades = new Navidad();
        Navidad navidades1 = new GuadalupeReyes();
        Navidad navidades2 = new NocheBuena();
        
        humano.consumo(navidades);   
        humano.consumo(navidades1);
        humano.consumo(navidades2);
    }
    
}
