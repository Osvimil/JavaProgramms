/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

 class MoreAsserts {
    static int x = 5;
    public static void main(String [] args) {
      assert(doStuff(42));
      if(x < 40) ;
      else assert(false);    
    }
    public static boolean doStuff(int arg) { 
      assert(arg < x++); 
     return false; 
   }
 }
