public class MethodPara
{
    static void sum(int a,int b)
    {
        int sum;
        sum=a+b;

        System.out.println("SUM = "+sum);
    }

    public static void main(String[] args)
    {
        int n1=30,n2=70;

        sum(n1,n2);
    }
}
