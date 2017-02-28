
package seminariodocetallas;

import java.util.Scanner;

enum Tallas {CHICA("S"),MEDIANA("M"),GRANDE("L"),EXTRAGRANDE("XL");
private String abreviatura;

private Tallas(String abreviatura){
    this.abreviatura = abreviatura;
}

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
}

class Ropa{
    private Tallas talla;

    public Tallas getTalla() {
        return talla;
    }

    public void setTalla(Tallas talla) {
        this.talla = talla;
    }
}


public class SeminarioDoceTallas {

    
    public static void main(String[] args) {
        
        Ropa uno = new Ropa();
        uno.setTalla(Tallas.CHICA);
        
       
    }
    
}
