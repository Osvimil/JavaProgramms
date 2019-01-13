
package interfacefiguras;

import java.util.ArrayList;
import java.util.List;


public class InterfaceFiguras {

    
    public static void main(String[] args) {
        
        Cuadrado cuadrado1 = new Cuadrado(20f);
        Cuadrado cuadrado2 = new Cuadrado(30f);
        
        Circulo circulo1 = new Circulo(12.34f);
        Circulo circulo2 = new Circulo(10.11f);
        
        Rectangulo rect1 = new Rectangulo(8f,10f);
        Rectangulo rect2 = new Rectangulo(4f,8f);
        
        List<Figura> figurillas = new ArrayList<Figura>();
        
        figurillas.add(cuadrado1);
        figurillas.add(cuadrado2);
        figurillas.add(circulo1);
        figurillas.add(circulo2);
        figurillas.add(rect1);
        figurillas.add(rect2);
        
        float areaTotal=0;
        
        for(Figura recorredor: figurillas){
            areaTotal = areaTotal + recorredor.area(); 
        }
        
        System.out.println("Se tiene un total de: "+figurillas.size()+" figuras y un area total de: "
        +areaTotal+" unidades cuadradas");
        
        
        
        
    }
    
}
