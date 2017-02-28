/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;


import java.util.*;
  class AddStuff {
    public static void main(String [] args) {
      TreeSet<String> t = new TreeSet<String>();
      if(t.add("one "))
        if(t.add("two "))
          if(t.add("one "))
            t.add("two ");
    for(String s : t)
       System.out.print(s);
   }
 }
