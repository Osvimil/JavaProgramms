
package matriz;

import java.util.Scanner;


public class Matriz {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /*int matriz[][] = new int[3][3];
        
        for(int i=0; i<=2;i++){
        for(int j=0; j<=2;j++){
        matriz[i][j] = i+1;
        }
        }
        
        System.out.println("Matriz 3*3:");
        for(int i=0;i<=2;i++){
        for(int j=0;j<=2;j++)
        System.out.print(matriz[i][j] + "\t");
        System.out.println();
        }*/
        
        /*int matriz[][] = new int[3][3];
        matriz[0][0] =1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        
        matriz[1][0] =1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;
        
        matriz[2][0] =1;
        matriz[2][1] = 2;
        matriz[2][2] = 3;
        
        
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.println("matriz["+i+"]["+j+"]= "+matriz[i][j]);
        
        }
        
        }*/
        
        /*Scanner sc = new Scanner(System.in);
        int arreglote[][] = new int [50][50];
        int arregloAuxiliar[] = new int[100];
        int a,i,j, auxiliar, contador=0;
        int aleatorio;
        
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
        arreglote[i][j] = aleatorio = (int)Math.floor(Math.random()*(100-10+1)+10);
        arregloAuxiliar[contador] = arreglote[i][j];
        contador++;
        
        }
        }
        
        System.out.println("Arreglo desordenado");
        
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
        System.out.print("fila: "+(i+1)+" columna: "+(j+1)+" = "+arreglote[i][j]);
        }
        System.out.println();
        
        }
        
        for(i=0;i<16;i++){
        for(j=i+1;j<16;j++){
        if(arregloAuxiliar[i]>arregloAuxiliar[j]){
        auxiliar = arregloAuxiliar[i];
        arregloAuxiliar[i] = arregloAuxiliar[j];
        arregloAuxiliar[j] = auxiliar;
        
        }
        
        }
        
        }
        
        contador=0;
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
        arreglote[i][j]= arregloAuxiliar[contador];
        contador++;
        
        }
        }
        System.out.println("Arreglo ordenado");
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
        System.out.print("fila: "+(i+1)+" columna: "+(j+1)+" ="+arreglote[i][j]);
        
        }
        System.out.println();
        }*/
        
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[20];
        int limite, aux, i,j;
        System.out.println("Ingresa limite de numeros");
        limite = sc.nextInt();
        
        for(i=0;i<limite;i++){
            System.out.print("X["+(i+1)+"] = ");
            arreglo[i] = sc.nextInt();
        
        }
        for(i=0;i<limite;i++){
            for(j=i+1;j<limite;j++){
                if(arreglo[i]<arreglo[j]){
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;                
                }
            }       
        }
        System.out.print("Arreglo= {");
        for(i=0;i<limite;i++){
            System.out.print(arreglo[i]+",");
        
        }
        System.out.print("}");   
    }    
}
