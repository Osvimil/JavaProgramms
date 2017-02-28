
package otraabstraccion;


public class OtraAbstraccion {

    
    public static void main(String[] args) {
        Ipn ipn = new Ipn();
        Unam unam = new Unam();
        ColegioBachilleres colegio = new ColegioBachilleres();
        
        
        ipn.tipo_escuela();
        unam.tipo_escuela();
        colegio.tipo_escuela();
        
        ipn.nombreson();
        unam.nombreson();
        colegio.nombreson();
    }
    
}
