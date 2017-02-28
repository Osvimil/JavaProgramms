
package seminariooncenavegar;

enum Direccion {NORTE(1),SUR(2),ESTE(3),OESTE(4);
private int distancia;

private Direccion(int distancia){
this.distancia = distancia;
}

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}

class Barco{
    /*public static final int NORTE=1;
    public static final int SUR=2;
    public static final int ESTE=3;
    public static final int OESTE=4;*/
    private Direccion orientacion;

    public Direccion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Direccion orientacion) {
        this.orientacion = orientacion;
    }    
}


public class SeminarioOnceNavegar {

   
    public static void main(String[] args) {
        Barco barco = new Barco();
        barco.setOrientacion(Direccion.NORTE);
        System.out.println("Barco viaja en la dirección: "+barco.getOrientacion());
        System.out.println("Los barcos viajan en las direcciones: "+ "en las siguientes direcciones:");
        
        for(Direccion dir:Direccion.values()){
            System.out.println(dir);
            if(dir == Direccion.NORTE || dir == Direccion.SUR){
                System.out.println("Viajan en la direccion correcta");            
            }else{
            
                System.out.println("Viajan de manera erronea");
            }
        
        }
        Direccion d = barco.getOrientacion();
        System.out.println("El barco que viaja en: "+barco.getOrientacion()+" y su distancia: "+d.getDistancia());
        
    }
    
}
