
package conexion;

import java.net.*;
import java.io.*;
public class Conexionn {
    
    final int puerto = 5000;
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    String mensajeRecibido;
    
    public void initServer(){
    BufferedReader entrada;
    
    
    try{
    sc = new ServerSocket(puerto);
    so = new Socket();
    System.out.println("Esperando conexion");
    so = sc.accept();
    System.out.println("cliente conectado");
    
    entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
    salida = new DataOutputStream(so.getOutputStream());
    
    System.out.println("Confirmando conexion al cliente");
    salida.writeUTF("conexion exitosa \n envia mensaje...");
    
    mensajeRecibido = entrada.readLine();
    System.out.println(mensajeRecibido);
    
    salida.writeUTF("mensaje recibido \n Terminando conexion");
    salida.writeUTF("\ngracias por la conexion au revoir");
    sc.close();
    }catch(Exception e){
    System.out.println("no se pudo realizar conexion"+e.getMessage());
    }  
}
}
