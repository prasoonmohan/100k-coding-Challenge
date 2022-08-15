public class SumTwo
{
    void Sum(int a,int b)
    {

        SubTwo su=new SubTwo();

       int sum=a+b;

       System.out.println("Sum = "+sum); 

       su.Sub(a,b);
    }
}