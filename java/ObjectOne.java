public class ObjectOne
{
    public static void main(String[] args)
    {
        ExampleOne ob1=new ExampleOne();
        ExampleOne ob2=new ExampleOne();

        
        ob1.a=10;
        ob1.b=50;
        ob2.a=7465;
        ob2.b=38764763;
        ob1.a=190;
        
        System.out.println("a = "+ob1.a);
        System.out.println("b = "+ob1.b);
        System.out.println("a = "+ob2.a);
        System.out.println("b = "+ob2.b);
    }
}