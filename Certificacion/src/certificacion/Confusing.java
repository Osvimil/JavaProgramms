/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;


public class Confusing {
    private Confusing(Object o) {
        System.out.println("Object");
    }

	private Confusing() {
        System.out.println("Constructor");    }
    
    private Confusing(double[] dArray) {
        System.out.println("double[] array");
    }

	private Confusing(double dArray) {
        System.out.println("double array");
    }
    
    public static void main(String[] args) {
        new Confusing(null);
    }
}