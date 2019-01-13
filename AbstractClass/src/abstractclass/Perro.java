
package abstractclass;

public class Perro extends Animal{
    
    public Perro(){
        super();
        setNombre("Snnopy");
    }

    @Override
    public void moverse() {
        System.out.println("Yo perro camino en cuatro patas");
    }
    
}


/*
public class Perro extends Animal {
    
    /*public Perro(){
    super(); //ejecuta codigo del constructor padre
    setNombre("Perro");
    }
    
    
    @Override
    public void moverse(){
    System.out.println("Camino en cuatro patas");
    }*/
    
/*   public Perro(){
super();
setNombre("Snoopy");
}
@Override
public void moverse(){
System.out.println("Soy un perro, camino en 4 patas");
}

}*/
