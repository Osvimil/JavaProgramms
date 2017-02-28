
package myagendpersistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {
    
    private String path="agenda.obj";
    private Hashtable<Integer,Persona> tabla;
    
    public Agenda() throws IOException,ClassNotFoundException{
        FileInputStream fi=null;
        ObjectInputStream oi=null;
        
        try{
              fi = new FileInputStream(path);
              oi = new ObjectInputStream(fi);
              tabla = (Hashtable<Integer,Persona>) oi.readObject();
        
        }catch(FileNotFoundException ex){
            tabla = new Hashtable <Integer,Persona>();
        
        }        
    }
    
    
    
    
    public boolean agregar(int clave, String nombre,String telefono){
        if(!tabla.containsKey(clave)){
        
            Persona p = new Persona(clave,nombre,telefono);
            tabla.put(clave, p);
            return true;
        }else{
        
            return false;
        }    
    }
    
    
    
    
    public boolean eliminar(int clave){
        if(tabla.containsKey(clave)){
            tabla.remove(clave);
            return true;
        
        }else{
            return false;      
        }    
    }
    
    
    public Persona recuperar(int clave){
        if(tabla.containsKey(clave)){
            return tabla.get(clave);
        
        }else{
            return null;
        
        }    
    }
    
    
    
    
    public Enumeration total(){
        return tabla.keys();
    
    }
 
    
    
    public void guardar() throws FileNotFoundException, IOException{
    
        FileOutputStream fo = new FileOutputStream(path);
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(tabla);
        os.close();       
    }
}
