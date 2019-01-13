
package seminariocuatro;
import java.util.Scanner;

public class SeminarioCuatro {

    
    public static void main(String[] args) {
        int []arreglin = new int[10];
        Scanner objeto = new Scanner(System.in);
        int menor=arreglin[0];
        int mayor=arreglin[0];
        
        for(int i=0;i<arreglin.length;i++){
            System.out.println("Ingresa numero:");
            arreglin[i]=objeto.nextInt();
            
            if(arreglin[i]<menor){
                menor=arreglin[i];           
            }
            if(arreglin[i]>mayor){
                mayor=arreglin[i];           
            }
        
        }
        System.out.println("EL MAYOR ES: "+mayor);
        System.out.println("EL MENOR ES: "+menor);
    
        /*int numero[][] = new int[3][3];
        Scanner valorcin = new Scanner(System.in);
        for(int i=0;i<numero.length;i++){
        for(int j=0;j<numero[i].length;j++){
        numero[i][j] = valorcin.nextInt();
        
        }
        
        }
        int sumon=0;
        for(int i=0; i<numero.length;i++){
        for(int j=0;j<numero[i].length;j++){
        if(i==j){
        sumon = sumon+numero[i][j];
        //sumon+=numero[i][j];
        System.out.println(sumon);
        
        }
        
        }
        
        }  */                                
}

    }
    

