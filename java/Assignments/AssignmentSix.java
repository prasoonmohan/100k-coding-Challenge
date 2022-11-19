import java.util.Scanner;
public class AssignmentSix
{
    public static void main(String[] args)
    {
        Scanner q=new Scanner(System.in);

        System.out.println("enter ur choice (1 to 7): ");
        int number=q.nextInt();

        switch(number)
        {
            case 1:
                System.out.println("SUNDAY.");
                break;

            case 2:
                System.out.println("MONDAY.");
                break;

            case 3:
                System.out.println("TUESDAY.");
                break;

            case 4:
                System.out.println("WEDNESDAY.");
                break;

            case 5:
                System.out.println("THURSDAY.");
                break;

            case 6:
                System.out.println("SATURDAY.");
                break;

            case 7:
                System.out.println("SUNDAY.");
                break;

            default :
                System.out.println("default choice !");
                break;
        }
    }
}