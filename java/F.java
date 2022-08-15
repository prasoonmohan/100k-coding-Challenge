public class F extends E
{
    F()
    {
        
        System.out.println("F constructor.");
    }

    F(int a)
    {
        super(10); //call argument constructor of E (parent class)

        System.out.println("F constructor with argument.");
    }

    public static void main(String[] args)
    {
        F f=new F(10); 
        F d=new F();


    }
}