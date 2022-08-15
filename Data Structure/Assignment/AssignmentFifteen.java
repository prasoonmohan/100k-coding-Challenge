import java.util.Scanner;

public class AssignmentFifteen
{
    static int GetArray(int[] a,int s)
    {
        int i;
        Scanner q=new Scanner(System.in);
        for(i=0;i<s;i++)
        {
            a[i]=q.nextInt();
        }
        return a[];
    }

    static void Display(int[] b)
    {
        int i;
        for(i=0;i<b.length;i++)
        {
            System.out.print("\t"+b[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner y=new Scanner(System.in);

        System.out.println("enter array size :");
        int size=y.nextInt();
        int[] ar=new int[size];

        ar=GetArray(ar,size);
        Display(ar);
    }
}