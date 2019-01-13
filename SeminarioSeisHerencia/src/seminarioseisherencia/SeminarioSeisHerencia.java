
package seminarioseisherencia;


public class SeminarioSeisHerencia {

   
    public static void main(String[] args) {
        
        Deportista oswaldo = new Deportista(1,"Oswaldo");
        Futbolista alfonso = new Futbolista(2,"Alfonso",1);
        Basquetbolista andrea = new Basquetbolista(3,"Andrea",1,2);
        
        andrea.muestra();
        alfonso.muestra();
        oswaldo.muestra();
       
        System.out.println("-----------------");
        andrea.setPuntos(9);
        andrea.setRebotes(5);
        andrea.setNombre("Andrea Diansanela");
        andrea.muestra();
        
        System.out.println("------------------");
        alfonso.setGoles(10);
        alfonso.setNombre("Alfonso Peralta");
        alfonso.muestra();
        System.out.println("--------------");
        oswaldo.setNombre("Oswaldo Saldivar");
        oswaldo.muestra(); 
    }
    
}
