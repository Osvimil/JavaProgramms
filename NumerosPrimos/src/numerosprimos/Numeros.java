
package numerosprimos;


public class Numeros {
    public void iniciar(int limite){
        for(int i=1;i<limite;i++){
            if(esPrimo(i)){
                System.out.println("Numero primo: "+i);
            }
        
        }
    }
    
    public boolean esPrimo(int numero){
        int auxiliar;
        for(int contador=2;contador<numero;contador++){
            auxiliar=numero%contador;
            if(auxiliar==0){
                return false;
            }
        
        }
        return true;
        
    }
    
}
