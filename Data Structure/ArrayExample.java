import java.util.Scanner;
public class ArrayExample
{
    public static void main(String[] args)
    {
        Scanner w=new Scanner(System.in);

        System.out.println("enter array limits : ");
        int limit=w.nextInt();

        int a1[]=new int[limit];
        int a2[]=new int[limit];

        int i;

        System.out.println("enter array 1 values : ");
        for(i=0;i<limit;i++)
        {
            a1[i]=w.nextInt();        }
        
        System.out.println("enter array 2 values : ");
        for(i=0;i<limit;i++)
        {
            a2[i]=w.nextInt();
        }
    }
}