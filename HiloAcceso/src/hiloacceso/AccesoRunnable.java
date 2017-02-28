
package hiloacceso;


public class AccesoRunnable implements Runnable {
    
    private int valor;
    Acceso ac;
    
    public AccesoRunnable(){
    
        this.ac = new Acceso();
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void run() {
        synchronized(ac){
        
        int actual = ac.getValor();
        actual++;
        try{
        
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        
        }
        ac.setValor(actual);
        System.out.println("Total de accesos: "+ac.getValor());
       
    }
    }
}
