/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotherexc;

/**
 *
 * @author oswaldosaldivar
 */
public class CustomException extends Exception {
    
    public static final long serialVersionIUD = 70L;
    
    public CustomException(String mensaje){
    super(mensaje);
    }
    
}
