/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

public class TeSet {
     public static void main(String args[]) {
       int m = 2;
       int p = 1;
       int t = 0;
       for(;p < 5;p++) {
         if(t++ > m) {
           m = p + t;
         }
      }
      System.out.println("t equals " + t);
    }
  }