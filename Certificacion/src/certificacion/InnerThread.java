/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

 public class InnerThread{
	
	public static void main(String[] s){
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("Runnable");
			}
		};
		Thread t = new Thread(r){
			public void run(){
				System.out.println("Thread");
			}	
		};
		t.start();
	}	
	
 }
