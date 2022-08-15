import java.util.Scanner;
public class AssignmentNine
{
    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);
        
        System.out.println("enter a number :");
        int num=y.nextInt();

        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println("\n");
        }

    }
}