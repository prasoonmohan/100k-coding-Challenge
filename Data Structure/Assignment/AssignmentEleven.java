import java.util.Scanner;
public class AssignmentEleven
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        
        System.out.println("enter the limi :");
        int limit=t.nextInt();

        int count=0;

        for(int i=1;i<=limit;i++)
        {
            
            if(i%2==0)
            {
                count++;
            }
        }

        System.out.println("NUMBER OF EVEN NUMBERS IN GIVEN LIMIT IS : "+count);
    }
}