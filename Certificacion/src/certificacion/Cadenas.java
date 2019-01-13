/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;


 enum AÑO{ENE,FEB,MAR,ABR,MAY,JUN,JUL,AGS,SEP,OCT,NOV,DIC}

public class Cadenas{
	public static void main(String ... s){
		AÑO a = AÑO.JUN;
		AÑO c = null;
		for(AÑO b: AÑO.values()){
			if(b.equals(a)){
				break;
			}
			c = b;
		}
		System.out.println(c + "-" + AÑO.OCT);
	}
}
