
package modelo;

import java.util.ArrayList;
import java.util.List;


public class ListaPersona {
    static List usuario;
    
    public ListaPersona(){
        if(usuario==null){
            usuario = new ArrayList();
        }
    }
    
    public void agregar(Persona persona){
        usuario.add(persona);
        
    }
    
    public String [][] mostrar(){
        String [][] datos = new String[usuario.size()][2];
        int contador = 0;
        
        for(Object object: usuario){
            Persona persona = (Persona)object;
            datos[contador][0] = persona.getNombre();
            datos[contador][1] = persona.getApellidos();
            contador++;
        }
        return datos;
    }
    
    
}
