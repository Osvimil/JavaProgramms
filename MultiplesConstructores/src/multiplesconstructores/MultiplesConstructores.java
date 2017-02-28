/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesconstructores;

/**
 *
 * @author oswaldosaldivar
 */
public class MultiplesConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emple = new Empleado("Oswaldo","Peralta");
        Empleado emple1 = new Empleado("Maria","Angeles",56331147);
        Empleado emple2 = new Empleado("Isabel","Segunda",56331123,987654);
        Empleado emple3 = new Empleado("Cesar","Millán",89341290,123456,20);
        Empleado emple4 = new Empleado("Mauricio","Acosta",87123490,004472,34,"Avenida siempre viva");
        Empleado emple5 = new Empleado("Veronica","Vilchis",12204590,111111,23,"Avenida de los molcajetes","vero@hotmail.com");
        
        emple.imprimir();
        emple1.imprimir();
        emple2.imprimir();
        emple3.imprimir();
        emple4.imprimir();
        emple5.imprimir();
    }
    
}
