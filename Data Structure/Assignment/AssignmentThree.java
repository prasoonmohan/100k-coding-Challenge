import java.util.Scanner;
public class AssignmentThree
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);

        System.out.println("enter the PRINCIPLE AMOUNT :");
        int principle=x.nextInt();

        System.out.println("enter the INTEREST RATE :");
        Float interest=x.nextFloat();

        System.out.println("enter the NUMBER OF YEARS ;");
        float years=x.nextFloat();

        Float si=(principle*interest*years)/100;

        System.out.println("SIMPLE INTEREST = "+si);

    }
}