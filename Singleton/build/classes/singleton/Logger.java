
 
package singleton;


public class Logger {
    
    //CREAR VARIABLE PRIVADA Y ESTATICA
    private static Logger log;
    private String valor;
    
    
    //CONSTRUCTOR PRIVADO
    private Logger(){
        
    }
    
    //METODO PARA OBTENER INSTANCIA
    public static Logger getInstance(){
        if(log == null){
            log = new Logger();       
        }
        return log;
    }
    
    public String getValor(){
        return valor;
    }
    public void setValor(String v){
        valor = v;
    
    }
    
    
    public void log(String mensaje){
        System.out.println(mensaje);
    }
    
    
}
