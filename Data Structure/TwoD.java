import java.util.Scanner;
public class TwoD
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
                a1[i][j]=nextInt();
                
            }
        }
    }
}