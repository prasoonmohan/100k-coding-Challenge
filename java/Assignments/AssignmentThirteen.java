import java.util.Scanner;
public class AssignmentThirteen
{
    public static void main(String[] args)
    {
        Scanner u=new Scanner(System.in);
        System.out.println("Eneter the array size :");

        int size=u.nextInt();

        int[] array=new int[size];

        int i,j,temp;

        System.out.println("enter array elements :");
        for(i=0;i<size;i++)
        {
            array[i]=u.nextInt();
        }

        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                    
                }
            }
        }

        System.out.println("ARRAY AFTER DECSENDING ORDER :");
        for(i=0;i<size;i++)
        {
           System.out.print("\t"+array[i]);
        }
        
    }
}