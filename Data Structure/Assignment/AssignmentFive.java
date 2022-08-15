import java.util.Scanner;

public class AssignmentFive
{
    public static void main(String[] args)
    {
        Scanner z=new Scanner(System.in);

        System.out.println("enter your mark : ");
        float mark=z.nextFloat();

        if(mark>=90)
        {
            System.out.println("GRADE IS A");
        }

        else if(mark>=80&&mark<=89)
        {
            System.out.println("GRADE IS B"); 
        }

        else if(mark>=70&&mark<=79)
        {
            System.out.println("GRADE IS C");
        }

        else if(mark>=60&&mark<=69)
        {
            System.out.println("GRADE IS D");
        }

        else if(mark>=50&&mark<=59)
        {
            System.out.println("GRADE IS E");
        }

        else
        {
            System.out.println("FAILED !");
        }
    }
}    