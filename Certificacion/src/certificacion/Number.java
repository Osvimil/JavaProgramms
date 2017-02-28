/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

 class Number {
    public static void main(String [] args) {
      try {
        System.out.print(Integer.parseInt("forty "));
      } catch (RuntimeException r) {
        System.out.print("runtime ");
        
      } 
      
      /*catch (NumberFormatException e) {
      System.out.print("number ");
      }*/
   }
 }
