
package SeminarioDos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadoresUnarios {

    public static void main(String[] args) {
        // TODO code application logic here
        /*int a=3;
        int b =0;
        
        b=++a;
        System.out.println("a="+a);
        System.out.println("b="+b);
        
        b=a++;
        
        System.out.println("a="+a);
        System.out.println("b="+b);*/
       
       
       for(int i=10,j=0;i>j;i--,j++){
           System.out.println("i"+i);
           System.out.println("j"+j);
       }
       
       
       /*
       int x=0;
       int incre=0;
       do{
       incre++;
       Scanner sc = new Scanner(System.in);
       int numero=0;
       
       System.out.print("Introduzca numero: ");
       numero = sc.nextInt();
       
       if(numero == (Math.round(Math.random()*30))){
       System.out.println("le has atinado al numero");
       
       
       }else{
       System.out.println("Haz fallado");
       }
       }while(incre<5);*/
       
       
       
       /*int aleatorion = (int)(Math.round(Math.random()*10));
       
       int numeron=0;
       int intenton=0;
       do{
       intenton++;
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresa numero: ");
       numeron = sc.nextInt();
       
       if(aleatorion>numeron){
       System.out.println("Ingresa uno mas alto");
       }else if(aleatorion<numeron){
       System.out.println("Ingresa uno mas bajo");
       }
       }while(numeron!=aleatorion);
       System.out.println("Haz hacertado el numero en: "+intenton+" intentos");*/
            
      
		
		/*int aleatorio=(int)(Math.random()*10);
 
		int numero=0;
		int intentos=0;
		do{
			intentos++;
			numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Número"));
 
			if(aleatorio<numero){
				JOptionPane.showMessageDialog(null, "Ingrese Número mas bajo");
 
			}else if(aleatorio>numero){
				JOptionPane.showMessageDialog(null, "Ingrese Número mas alto");
 
			}
 
		}while(numero!=aleatorio);
		JOptionPane.showMessageDialog(null, "Muy Bien Conseguiste Adivinar el Número en " + intentos + " intentos");*/
       
       }
    }
    

