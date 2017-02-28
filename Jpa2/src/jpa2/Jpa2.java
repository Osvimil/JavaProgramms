/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2;

/**
 *
 * @author oswaldosaldivar
 */
public class Jpa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final CtrlConocidos ctrlConocidos = new CtrlConocidos();

 final Conocido pp = new Conocido("Oswaldo", "56331147");

 System.out.print("Contenido original de Oswaldo: "+pp);

 //System.out.println(pp);

 ctrlConocidos.agrega(pp);

 System.out.println("Después de agregar: " + pp);

 final Long idPp = pp.getId();

 System.out.println(pp);

 pp.setNombre("Alfonso");

 pp.setTelefono("55347888");

 System.out.println("Después de modificar: " + ctrlConocidos.modifica(pp));

 System.out.println("El objeto de la referencia pp: " + pp);

 System.out.println("El objeto en la base de datos: " + ctrlConocidos.busca(

 idPp));

 ctrlConocidos.agrega(new Conocido("Maria", "90567833"));

 ctrlConocidos.agrega(new Conocido("Jose", "90782111"));
  ctrlConocidos.agrega(new Conocido("Patricio", "90782111"));

 System.out.println("Contenido de la base: " + ctrlConocidos.lista());

 ctrlConocidos.elimina(idPp);

 System.out.println("Sin Oswaldo: " + ctrlConocidos.lista());         
    }
    
}
