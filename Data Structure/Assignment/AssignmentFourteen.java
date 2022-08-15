import java.util.Scanner;
public class AssignmentFourteen
{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);

        System.out.println("enter array size :");
        int size=p.nextInt();
        int[][] a1=new int[size][size];
        int[][] a2=new int[size][size];
        int[][] sum=new int[size][size];

        int i,j;

        System.out.println("ARRAY 1 VALUES :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                a1[i][j]=p.nextInt();
                
            }
        }
        System.out.println("ARRAY 2 VALUES :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                a2[i][j]=p.nextInt();
            }
        }

        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }

        System.out.println("SUM OF BOTH ARRAY :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.print(sum[i][j]);
            }
            System.out.println(" ");
        }
    }
}