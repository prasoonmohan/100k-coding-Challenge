public class MethodOverloading
{
    static int FindSum(int a,int b)
    {
        int sum=a+b;

        return sum;
    }
    static int FindSum(int x,int y,int z)
    {
        int summ=x+y+z;

        return summ;
    }
    static double FindSum(double n1,Double n2)
    {
       
        return n1+n2;
    }

    public static void main(String[] args)
    {
        int s1=FindSum(10,10);

        int s2=FindSum(100,200,300);

        Double s3=FindSum(10.66,9.44);

        System.out.println("1 = "+s1);

        System.out.println("2 = "+s2);

        System.out.println("3 = "+s3);
    }
}