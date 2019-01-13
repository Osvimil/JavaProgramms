/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

 class Top {
    static int x = 1;
    public Top() { x *= 3; }
  }
  class Middle extends Top {
    public Middle()  { x += 1; }
    public static void main(String [] args) {
      Middle m = new Middle();
      System.out.println(x);
   }
 }
