
package seminarioseisherencia;


public class Futbolista extends Deportista {   
    private int goles;
    
    public Futbolista(int registro,String nombre,int goles){
        super(registro, nombre);
        this.goles=goles;    
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }
    
    @Override
    public void muestra(){
        super.muestra();
        System.out.println("Goles:"+goles);
    }
    
    
}
