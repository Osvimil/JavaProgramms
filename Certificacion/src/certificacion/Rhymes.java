/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

 import java.util.*;
 
 public class Rhymes {
    public static void main(String[] args) {
        StringBuffer word = null;
        switch(1) {
            case 1:  word = new StringBuffer('P');
            case 2:  word = new StringBuffer('G');
            default: word = new StringBuffer('M');
       }
       word.append('a').append('i').append('n');
       System.out.println(word);
   }
 }
