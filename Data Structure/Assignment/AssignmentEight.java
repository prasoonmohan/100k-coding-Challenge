import java.util.Scanner;
public class AssignmentEight
{
    public static void main(String[] args)
    {
        Scanner v=new Scanner(System.in);

        System.out.println("enter the limit :");
        int limit=v.nextInt();

        int sum=0;

        for(int i=1;i<=limit;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS IN GIVEN LIMIT IS :"+sum);
    }
}