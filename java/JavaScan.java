import java.util.Scanner;

public class JavaScan
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter two numbers :");

        int a=s.nextInt();
        int b=s.nextInt();

        int sum=a+b;

        System.out.println("RESULT ="+sum);
    }
}