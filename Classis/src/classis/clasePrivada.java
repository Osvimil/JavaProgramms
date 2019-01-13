/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classis;

/**
 *
 * @author oswaldosaldivar
 */
public class clasePrivada {
    
    private String cadena = "cadena privada";
    private int numero = 199;
    
    private void metadato(){
        System.out.println("método privado caon");
    }
    
    public void setCadena(String cadena){
    this.cadena=cadena;
    }
    public String getCadena(){
    return cadena;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    
    }
    public int getNumero(){
    return numero;
    }
    
}
