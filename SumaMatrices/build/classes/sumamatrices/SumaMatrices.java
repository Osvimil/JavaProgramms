
package sumamatrices;
import java.io.*;


public class SumaMatrices {

    public static void main(String[] args) throws IOException {
        
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a,i,j;
    System.out.print("Ingresa dimension matriz:");
    a=Integer.parseInt(in.readLine());
    double c[][]=new double [a][a];
    double d[][]=new double [a][a];
    double e[][]=new double [a][a];
    System.out.println("Ingrese valores matriz 1");
    for( i=0;i<a;i++)
    {
    for( j=0;j<a;j++)
    c[i][j]=Double.parseDouble(in.readLine ());
    }//for1
    System.out.println("Ingresa matriz 2");
    for(i=0;i<a;i++)
    {
    for( j=0;j<a;j++)
    d[i][j]=Double.parseDouble(in.readLine ());
    }//for2
    System.out.println("La suma es: ");
    for( i=0;i<a;i++){
    for(j=0;j<a;j++)
    {
    e[i][j]=c[i][j]+d[i][j];

    }
    }
    for (i=0; i<a;i++){
    for (j=0;j<a;j++)
    System.out.print(e[i][j]+ ""+"\t");
    System.out.println("");
    }            
    }
    
}
