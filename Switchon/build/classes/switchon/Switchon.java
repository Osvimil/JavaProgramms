
package switchon;


public class Switchon {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=10;
        int y=20;
        int z=-12;
        
        if((x==y) && (x<=y)){
            System.out.println(true);
    
    }else{
            System.out.println(false); //imprime
        }
        
        if((z<y) || (x==y)){
            System.out.println(true);//imprime
        }else {
            System.out.println(false);
        }
        
        if(!(y>=z) || !(y<x)){
            System.out.println(true);//imprime
        }else{
            System.out.println(false);
        }
        
        
        /*switch(x){
            
            case 0:
                System.out.println("valor 0");
                break;
            case 10:
                System.out.println("valor 10");
                break;
            case 20:
                System.out.println("valor 20");
                break;
            default:
                System.out.println("autre valeur");
        
        
        }*/
    }
    
}
