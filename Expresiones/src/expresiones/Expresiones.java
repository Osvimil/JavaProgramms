
package expresiones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Expresiones {

   
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        String evaluar = "Je suis allé à l'ecole";
        String regex;
        while(true){
            regex= escaneo.next();
            if(regex.equals("salida"))
                break;
            
            Pattern patron =Pattern.compile(regex);
            Matcher man = patron.matcher(evaluar);
            
            boolean coincidencia = man.find();
            System.out.println("Is ther any conicidence?: "+coincidencia);
        
        
        }
    }
    
}
