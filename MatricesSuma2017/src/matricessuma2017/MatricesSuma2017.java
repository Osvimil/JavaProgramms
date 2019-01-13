
package matricessuma2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MatricesSuma2017 {

    
    public static void main(String[] args) throws IOException {
        
        BufferedReader objeto = new BufferedReader(new InputStreamReader(System.in));
        int a,i,j;
        System.out.println("Ingresa dimension matriz: ");
        a =  Integer.parseInt(objeto.readLine());
        double c [][] = new double[a][a];
        double d [][] = new double [a][a];
        double e [][] = new double [a][a];
        System.out.println("Ingresa primer matriz");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
              c[i][j] = Double.parseDouble(objeto.readLine());
            }
        
        }
        System.out.println("Ingresa segunda matriz");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                d[i][j] = Double.parseDouble(objeto.readLine());
            }
        
        }
        
        System.out.println("La suma es: ");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                e[i][j] = c[i][j] + d[i][j];
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                System.out.println(e[i][j]+""+"\t");
                System.out.println("");
            }
        }
        
        
    }
    
}
