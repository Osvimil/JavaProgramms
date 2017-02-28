
package seminarioseisherencia;


public class Basquetbolista extends Deportista {
    
    private int puntos;
    private int rebotes;
    
    public Basquetbolista(int registro,String nombre,int puntos,int rebotes){
        super(registro, nombre);
        this.puntos=puntos;
        this.rebotes=rebotes;  
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }
    
    @Override
    public void muestra(){
        super.muestra();
        System.out.println("Puntos: "+puntos);
        System.out.println("Rebotes: "+rebotes);
    }
    
}
