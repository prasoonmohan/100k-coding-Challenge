import java.util.Scanner;
public class AssignmentTwelve
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        
        System.out.println("enter the limit :");
        int limit=t.nextInt();

        int[] array=new int[limit];

        int count=0,i;

        System.out.println("enter the "+limit+" elements :");
        for(i=0;i<limit;i++)
        {
            array[i]=t.nextInt();        
        }

        for(i=0;i<limit;i++)
        {
            
            if(array[i]%2==0)
            {
                count++;
            }
        }

        System.out.println("NUMBER OF EVEN NUMBERS IN GIVEN ARRAY IS : "+count);
    }
}