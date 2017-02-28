
package ejemplomine;


public class EjemploMine {

    
    public static void main(String[] args) {
        
       final CtrlProbando ctrlProbando = new CtrlProbando();
        
        final Probando uno = new Probando("Oswaldo","Niños Heroes","64564564");
        System.out.println("Contenido de uno: "+uno);
        
        ctrlProbando.add(uno);
        
        ctrlProbando.add(new Probando("Maria", "Niños heroes","sdfsdfsf"));

 ctrlProbando.add(new Probando("Jose","Niños hereos", "90782111"));
  ctrlProbando.add(new Probando("Patricio", "Niños hereoes","90782111"));
   System.out.println("Contenido de la base: " + ctrlProbando.lista());
        
        
    }
    
}
