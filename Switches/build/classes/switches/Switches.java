
package switches;


public class Switches {
    
    //public enum Meses {enero,marzo,mayo,julio,septiembre,noviembre}
    
    public enum dias {lunes,martes,miercoles,jueves,viernes,sabado,domingo}

    
    public static void main(String[] args) {
        
        dias val;
        
        val = dias.viernes;
        
        switch(val){
                case lunes:
                    System.out.println("Es lunes");
                    break;
                case martes:
                System.out.println("Es martes");
                break;
                
                case miercoles:
                System.out.println("Es miercoles");
                break;
                case jueves:
                System.out.println("Es jueves");
                break;
                case viernes:
                System.out.println("Es viernes");
                break;
                case sabado:
                System.out.println("Es sabado");
                break;
                case domingo:
                System.out.println("Es domingo");
                break;
                default:
 
        }
        
        /*Meses valor;
        valor = Meses.julio;
        
        switch(valor){
        case enero:
        System.out.println("ENERO");
        break;
        case marzo:
        System.out.println("MARZO");
        break;
        case mayo:
        System.out.println("MAYO");
        break;
        case julio:
        System.out.println("JULIO");
        break;
        case septiembre:
        System.out.println("SEPTIEMBRE");
        break;
        case noviembre:
        System.out.println("NOVIEMBRE");
        break;
        default:
        System.out.println("el mes podría ser par");
        
        }*/
        
        
    }
    
}
