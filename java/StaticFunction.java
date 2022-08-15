public class StaticFunction
{
    int a=40;
    static int b=46;
    
    public static void main(String[] args)
    {
       Hello h=new Hello();


        System.out.println(h.b);
        
        h.Hello();    
        
 
    }

    void Hello()
    {

        System.out.println(b);

    }
}