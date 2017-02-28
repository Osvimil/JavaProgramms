
package myagendpersistence;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;


public class MyAgendPersistence {

    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        int clave;
        String nombre;
        String telefono;
        
        
        do{
        System.out.println("1.Agregar persona ");
        System.out.println("2.Eliminar persona ");
        System.out.println("3.Buscar persona");
        System.out.println("4.Mostrar todas las personas");
        System.out.println("5.Salir");
        System.out.println("Elige una opción");
        opcion = Integer.parseInt(sc.nextLine());
        
        
        
        switch(opcion){
            
            case 1:
                System.out.println("Dame clave");
                clave = Integer.parseInt(sc.nextLine());
                System.out.println("Dame nombre");
                nombre = sc.nextLine();
                System.out.println("Dame teléfono");
                telefono =sc.nextLine();
                
                if(agenda.agregar(clave, nombre, telefono)){
                    System.out.println("Persona agregada");
                }else{
                    System.out.println("Clave existente");               
                }
                break;
            case 2:
                System.out.println("Dame clave");
                clave = Integer.parseInt(sc.nextLine());
                if(agenda.eliminar(clave)){
                    System.out.println("Persona eliminada");
                }else{
                    System.out.println("Clave inexistente");
                
                }                
                break;
            case 3:
                System.out.println("Dame clave");
                clave = Integer.parseInt(sc.nextLine());
                Persona per = agenda.recuperar(clave);
                if(per!=null){
                    System.out.println("La clave es: "+per.getClave());
                    System.out.println("El nombre es: "+per.getNombre());
                    System.out.println("El teléfono es: "+per.getTelefono());
                }else{
                    System.out.println("No existe esa persona");               
                }                
                break;
            case 4:
                Enumeration e = agenda.total();
                while(e.hasMoreElements()){
                    clave = (Integer) e.nextElement();
                    Persona p = agenda.recuperar(clave);
                    System.out.println("La clave es: "+p.getClave());
                    System.out.println("El nombre es: "+p.getNombre());
                    System.out.println("El teléfono es: "+p.getTelefono());               
                }
                break;
            case 5:
                agenda.guardar();
                break;        
        }
        }while(opcion!=5);        
    }
    
}
