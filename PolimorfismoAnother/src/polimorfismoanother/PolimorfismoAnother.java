
package polimorfismoanother;


public class PolimorfismoAnother {

   
    public static void main(String[] args) {
       PaisMexico[] pm = new PaisMexico[3];
       
       Estado e = new Estado();
       Municipio m = new Municipio();
       Colonia c = new Colonia();
       
       pm[0]=e;
       pm[1]=m;
       pm[2]=c;
       
       for(PaisMexico x : pm){
           x.presentacion();
       
       }
    }
    
}
