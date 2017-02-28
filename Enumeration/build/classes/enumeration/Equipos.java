
package enumeration;

public enum Equipos {
    
    toluca("TOL","primera"),
    america("CDMX","primera"),
    atlante("CAN","segunda"),
    pumas("CDMX","primera"),
    zacatecas("ZAC","segunda"),
    lobos("PUE","segunda");
    
    private final String ciudad;
    private final String division;
    
    
     Equipos(String ciudad,String division){
        this.ciudad=ciudad;
        this.division=division;
    }
     
     public String getCiudad(){
     
        return ciudad;
     }
     public String getDivision(){
     
         return division;
     }
    
}
