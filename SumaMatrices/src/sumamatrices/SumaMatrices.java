
package sumamatrices;
import java.io.*;


public class SumaMatrices {

    public static void main(String[] args) throws IOException {
        BufferedReader objeto = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int i;
        int j;
        System.out.println("Ingresa dimension de la matriz:  ");
        a = Integer.parseInt(objeto.readLine());
        double c [][] = new double[a][a];
        double d [][] = new double [a][a];
        double e [][] = new double [a][a];
        
        System.out.println("Ingresa matriz uno: ");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                c[i][j] = Double.parseDouble(objeto.readLine());
            }     
        }
        System.out.println("Ingresa matriz dos");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                d[i][j] = Double.parseDouble(objeto.readLine());
            }
        }
        System.out.println("La suma es: ");
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                e[i][j] = c[i][j]+d[i][j];
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<a;j++){
                System.out.println(e[i][j]+ ""+"\t");
                System.out.println("");
            }
        
        }
        
        
        
        
    }   
}
