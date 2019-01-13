
package matrizfilascolumnas;

import java.util.Scanner;


public class MatrizFilasColumnas {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[20][20];
        int i,j ,sumaFila=0, sumaColumna=0, fila, columna;
        int aleatorio;
        
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                matriz[i][j] = aleatorio=(int)Math.floor(Math.random()*(9-1+1)+1);
            }
        
        }
        System.out.println("Matriz ingresada es: ");
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
           
        }
        
        
        System.out.println("Numero de fila a sumar: ");
        fila = sc.nextInt();
        for(i=0;i<5;i++){
            sumaFila = sumaFila+matriz[fila-1][i];
        }
        System.out.println("La suma de la fila: "+fila+"es: "+sumaFila);
        
        System.out.println("Numero de columna a sumar: ");
        columna = sc.nextInt();
        for(i=0;i<5;i++){
            sumaColumna = sumaColumna+matriz[i][columna-1];
        
        }
        System.out.println("La suma de la columna: "+columna+" es: "+sumaColumna);
        
        
    }
    
}
