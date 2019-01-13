
package abstractclass;


public abstract class  Animal {
    /* private String nombre;
    
    public Animal(){
    
    }
    public abstract void moverse();
    
    public void comer(){
    System.out.println("El: "+nombre+" está comiendo");
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }*/
    
    private String nombre;
    
    public Animal(){ 
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void comer(){
        System.out.println("El: "+nombre+" está comiendo");
    }
    
    public void actividad(){
        System.out.println("El "+nombre+" realiza una actividad");
    }
    public abstract void moverse();
    
   
}
