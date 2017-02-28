/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author oswaldosaldivar
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Algo alumno = new Algo();
        Algo profesor = new Algo();
        Algo trabajador = new Algo();
        
        alumno.setEdad(20);
        alumno.setTelefono(56331147);
        alumno.setPromedio(8.3f);
        
        profesor.setEdad(18);
        profesor.setPromedio(7.9f);
        profesor.setTelefono(56330164);
        
        trabajador.setEdad(23);
        trabajador.setPromedio(8.6f);
        trabajador.setTelefono(56122791);
        
        System.out.println("Alumno: "+alumno.getEdad()+" años");
        System.out.println("Alumno: "+alumno.getTelefono()+" telefono");
        System.out.println("Alumno: "+alumno.getPromedio()+" promedio");
        
        System.out.println("--------------");
        
        System.out.println("Profesor: "+profesor.getEdad()+" años");
        System.out.println("Profesor: "+profesor.getTelefono()+" telefono");
        System.out.println("Profesor: "+profesor.getPromedio()+" promedio");
        
                System.out.println("--------------");

        
        System.out.println("Trabajador: "+trabajador.getEdad());
        System.out.println("Trabajador: "+trabajador.getTelefono());
        System.out.println("Trabajador: "+trabajador.getPromedio());
        
    }
    
}
