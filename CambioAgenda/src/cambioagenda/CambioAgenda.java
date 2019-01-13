
package cambioagenda;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.Hashtable;
import java.util.Scanner;
public class CambioAgenda {
     static Scanner sc = new Scanner(System.in);
     static HashMap<Integer,Empleado> lista = new HashMap<Integer,Empleado>();

    
    public static void main(String[] args) {
        
         int opcion=0;
        int numEmpleado;
        String nombre;
        double sueldo;
                do{
                    System.out.println("1. Agregar empleado");
                    System.out.println("2. Consultar un empleado");
                    System.out.println("3. Consultar todos los empleados");
                    System.out.println("4. Borrar empleado");
                    System.out.println("5. Modificar empleado");
                    System.out.println("6. Salir");
                    System.out.println("Elige opcion...");
                    
                    opcion = Integer.parseInt(sc.nextLine());
                    
                    switch(opcion){
                        case 1:
                            System.out.println("dame numero de empleado");
                            numEmpleado = Integer.parseInt(sc.nextLine());
                            System.out.println("dame nombre de empleado");
                            nombre = sc.nextLine();
                            System.out.println("dame sueldo de empleado");
                            sueldo = Double.parseDouble(sc.nextLine());
                            agregarEmpleado(numEmpleado,nombre,sueldo);
                            break;
                            
                        case 2:
                            System.out.println("dame empleado numero");
                            numEmpleado = Integer.parseInt(sc.nextLine());
                            consultarEmpleado(numEmpleado);
                            break;
                            
                         case 3:
                            consultarEmpleados();
                            break;
                            
                         case 4:
                             System.out.println("dame empleado numero");
                             numEmpleado = Integer.parseInt(sc.nextLine());
                             borrarEmpleado(numEmpleado);
                             break;
                             
                         case 5:
                             System.out.println("dame numero de empleado");
                            numEmpleado = Integer.parseInt(sc.nextLine());
                            System.out.println("dame nombre de empleado");
                            nombre = sc.nextLine();
                            System.out.println("dame sueldo de empleado");
                            sueldo = Double.parseDouble(sc.nextLine());
                            modificarEmpleado(numEmpleado,nombre,sueldo);
                             break;
                                     
                    }
                }while(opcion!=6);
     }   

    private static void agregarEmpleado(int numEmpleado, String nombre, double sueldo) {
       Empleado emp = new Empleado(numEmpleado,nombre,sueldo);
       
       if(!lista.containsKey(numEmpleado))
       {
           lista.put(numEmpleado, emp);
           System.out.println("Empleado agregado");
       
       }
    }

    private static void consultarEmpleados() {
       Iterator<Integer> e = lista.keySet().iterator();
        while(e.hasNext()){ //mientras haya elementos...
            Integer clave = (Integer)e.next();
            Empleado emp = lista.get(clave);
            System.out.println("---Empleado ("+emp.getNumEmp()+")");
            System.out.println("Numero de empleado: "+emp.getNumEmp());
            System.out.println("Nombre de empleado: "+emp.getNombre());
            System.out.println("Sueldo de empleado: "+emp.getSueldo());
        
        }
    }

    private static void consultarEmpleado(int numEmpleado) {
        if(lista.containsKey(numEmpleado)){
            Empleado emp = lista.get(numEmpleado);
            System.out.println("---Empleado ("+emp.getNumEmp()+")");
            System.out.println("Numero de empleado: "+emp.getNumEmp());
            System.out.println("Nombre de empleado: "+emp.getNombre());
            System.out.println("Sueldo de empleado: "+emp.getSueldo());
                
        }else{
            System.out.println("No existe empleado");
        }
        
       
    }

    private static void borrarEmpleado(int numEmpleado) {
      if(lista.containsKey(numEmpleado)){
            //Empleado emp = lista.get(numEmpleado);
            lista.remove(numEmpleado);
            System.out.println("empleado eliminado");
        }else{
            System.out.println("No existe empleado");
        }
    }

    private static void modificarEmpleado(int numEmpleado, String nombre, double sueldo) {
        Empleado emp = new Empleado(numEmpleado,nombre,sueldo);
       
       if(lista.containsKey(numEmpleado))
       {
           lista.put(numEmpleado, emp);
           System.out.println("empleado modificado");
       
       }
        
    }
    
}
