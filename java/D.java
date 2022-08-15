public class D extends C
{
    D()
    {
    int a=10;

    super.a=20;

    int c=a+super.a;

    System.out.println(c);
    }

    

    void Display()
    {
        System.out.println("Its D");

        super.Display();
    }


public static void main(String[] args)
{
    D b=new D();

    b.Display();
}

}


//super keyword=used to access parent class or base class
