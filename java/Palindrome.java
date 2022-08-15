import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner f=new Scanner(System.in);

        System.out.println("Enter a string :");
        char[] val=f.next().charAt(0);
        int l,i,flag=0;

        l=val.length-1;
        for(i=0;i<l;i++)
        {
            if(val[i]!=val[l-i])
            {
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("String is palindrom.");
        }
        else
        {
            System.out.println("String is not palindrom.");
        }

    }
}