import java.util.Scanner;
public class AssignmentSeven
{
    public static void main(String[] args)
    {
        Scanner r=new Scanner(System.in);

        System.out.println("enter a value :");
        int value=r.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" * 5 = "+i*value);
            
        }
    }
}