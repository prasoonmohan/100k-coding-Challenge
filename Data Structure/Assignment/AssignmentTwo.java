import java.util.Scanner;
public class AssignmentTwo
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        
        System.out.println("enter a number");
        int number1=n.nextInt();
        System.out.println("enter a floating point number");
        float number2=n.nextFloat();

        float sum=number1+number2;

        System.out.println("Sum = "+sum);
    }
}