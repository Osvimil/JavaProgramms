
package enumeration;

import java.util.EnumSet;


public class Enumeration {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(Equipos diversos: Equipos.values())
            System.out.printf("%s\t %s\t %s\n",diversos,diversos.getCiudad(),diversos.getDivision());
        
        
        System.out.println("\n Rango de los equipos:\n");
        
        for(Equipos diversos: EnumSet.range(Equipos.toluca,Equipos.zacatecas))
        
            System.out.printf("%s\t %s\t %s\n",diversos,diversos.getCiudad(),diversos.getDivision());
    }
    
}
