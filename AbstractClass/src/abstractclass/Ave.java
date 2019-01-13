
package abstractclass;

public class Ave extends Animal{
    
    public Ave(){
        super();
        setNombre("Piolin");      
    }

    @Override
    public void moverse() {
        System.out.println("Yo pájaro aleteo o vuelo");
    }
}

/*
public class Ave extends Animal{
    
    /* public Ave(){
    super();
    setNombre("Ave");
    
    }
    @Override
    public void moverse(){
    System.out.println("Yo vuelo, soy una ave");
    }*/

/*
    public Ave(){
        super();
        setNombre("Piolin");
    }
    
    @Override
    public void moverse(){
        System.out.println("Soy un ave y vuelo chingon");
    }
      
}*/

