
package lapoo;


public class Pelotuki {
    // se declaran dos atributos flotantes
    float radio;
    float peso;
    
    public Pelotuki(){
    radio=100;
    peso=20;
    }
    
    /*public Pelotuki(float radio, float peso){
            this.radio=radio;
            this.peso=peso;
    }*/
      public void setRadio(float radio) {
        this.radio = radio;
    }
      
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getRadio() {
        return radio;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void Patear(){
        System.out.println("Patenado la bola");
    
    }
    public void Atrapar(){
        System.out.println("Atrapando la bola");
    }

    

  
    
          
}
