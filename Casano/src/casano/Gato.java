
package casano;


public class Gato {
     String nombre;
     double peso;
     double estatura;
    
    public Gato(String nombre,double peso,double estatura){
        this.nombre=nombre;
        this.peso=peso;
        this.estatura=estatura;
       
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public double getPeso(){
    return peso;
    }
    
    public void setPeso(double pes){
        peso=pes;
    }
    
    public double getEstatura(){
    return estatura;
    }
    
    public void setEstatura(double est){
        estatura=est;
    }
    
    public void Jugar(){
        System.out.println("cat is playing");
    }
    public void Comer(){
        System.out.println("cat is eating now");
    }
    
    
    
}
