
package cronometro;


public class Cronometro {

    
    public static void main(String[] args) {
        int minutos=0;
        int segundos=0;
        
        for(minutos=0;minutos<60;minutos++){
            
            for (segundos=0;segundos<60;segundos++) {
                System.out.println(minutos+":"+segundos);
                Delay();
            }
        }  
    }
    
    private static void Delay(){
        try{
        Thread.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
