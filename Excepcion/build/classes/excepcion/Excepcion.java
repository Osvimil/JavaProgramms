
package excepcion;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion {

    
    public static void main(String[] args) {
        Scanner impre = new Scanner(System.in);
        int variable;
        System.out.println("GIMME A NUMBER:");
        
        try{
            variable = impre.nextInt();
            System.out.println(variable);
                    
        }catch(InputMismatchException e){
            System.out.println("There is an error: "+e.getMessage());
        }finally{
        System.out.println("the programm has finished");
        }
        
    }
    
}
