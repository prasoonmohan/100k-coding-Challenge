import java.util.Scanner;
public class AssignmentFour
{
    public static void main(String[] args)
    {
        Scanner o=new Scanner(System.in);
        
        System.out.println("enter the mark :");
        Float mark=o.nextFloat();

        if(mark>=50)
        {
            System.out.println("PASSED !");

        }
        else
        {
            System.out.println("FAILED !");
        }
        
    }
}