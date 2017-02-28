

package singleton;


public class Singleton {

    
    public static void main(String[] args) {
       
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        //logger1.log("SOY SINGLENTON");
        
        logger1.setValor("que onda soy getlogger1");
        System.out.println(logger2.getValor());
    }
    
}
