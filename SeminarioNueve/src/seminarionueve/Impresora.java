

package seminarionueve;


public abstract class Impresora {
    
    private String marca;
    private String modelo;
    
    
    public Impresora(){    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public abstract void imprimir();
    public abstract void mostrarCaracteristicas();
    public abstract void imprimirConAhorraToner();
    public abstract void agregarCartucho(String color);
    
    
}
