public class MethodPararet
{
    static int sum(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
        
    }

    public static void main(String[] args)
    {
        int n1=30,n2=70,summ;

        summ=sum(n1,n2);

        System.out.println("SUM = "+summ);
    }
}
