
package tareathread;


public class TareaThread {

    
    public static void main(String[] args) {
        
        
        
        /* Tarea uno = new Tarea("Oswaldo");
        Tarea dos = new Tarea("Yugoslavia");
        Tarea tres = new Tarea("Carolina");
        uno.start();
        dos.start();
        tres.start();*/
        
        Tarea uno = new Tarea("Oswaldo");
        Tarea dos = new Tarea("Nora");
        Tarea tres = new Tarea("Elisa");
        
        Thread tUno = new Thread(uno);
        Thread tDos = new Thread(dos);
        Thread tTres = new Thread(tres);
      
        tUno.start();
        tDos.start();
        tTres.start();
        
        
        
    }
    
}
