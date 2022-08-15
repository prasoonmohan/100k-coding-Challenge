import java.util.Scanner;

public class PrimeJava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number :");
        int n=sc.nextInt();
        int flag=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                flag++;
            }
        }
        if(flag==2)
        {
            System.out.println(n+" IS PRIME NUMBER.");
        }
        else
        {
            System.out.println(n+" IS NOT PRIME NUMBER.");
        }

    }
}