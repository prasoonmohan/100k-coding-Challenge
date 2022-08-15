import java.util.Scanner;
public class ObjectFive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        OneFive a=new OneFive();
        OneFivesIX s=new OneFivesIX();
        
        System.out.println("enter two numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();

        a.sum(x,y);
        s.sub(x,y);


    
    }
}