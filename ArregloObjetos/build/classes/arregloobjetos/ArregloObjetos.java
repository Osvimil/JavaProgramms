
package arregloobjetos;


public class ArregloObjetos {

    
    public static void main(String[] args) {
        
       
        Alumnos[] arreglo = {
        
            new Alumnos(123,"Oswaldo"),
            new Alumnos(12345,"Alfonso"),
            new Alumnos(12673,"Paps"),
        };
        
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i].muestra();                       
            System.out.println("\n");
        }       
    }
    
}
