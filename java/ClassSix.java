import java.util.Scanner;
public class ClassSix
{
    public static void main(String[] args)
    {
        SumTwo a=new SumTwo();
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter two numbers :");
        int p=s.nextInt();
        int r=s.nextInt();

        a.Sum(p,r);

       

    
    }
}