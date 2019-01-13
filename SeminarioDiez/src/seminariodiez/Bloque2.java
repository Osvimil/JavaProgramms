
package seminariodiez;


public class Bloque2 {
    
    
    
    private static int x=12;
    private static int y=2;
    static{
        x*=2;
        System.out.println(x);
        
    }
    static{
        x+=23;
        System.out.println(x);
    }
    
    {   
        y+=120;
        System.out.println(y);
    }
    static{
    
        x-=34;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        Bloque2 b = new Bloque2();
        System.out.println("X="+x); //2
        System.out.println("Y="+y);//122
        
    }
    
    static{
        x/=2;
        System.out.println(x);
    }
    
}
