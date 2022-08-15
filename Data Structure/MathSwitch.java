import java.util.Scanner;

public class JavaExampleSwitch
{
        static void Addition(int a,int b);
        {
            int ad=a+b;
            System.out.println("Addition of "+a+" , "+b" = "+ad);
        }

        static void Subtraction(int c,int d);
        {
            int sub=c-d;
            System.out.println("Subtraction of "+c+" , "+d" = "+sub);
        }

        static void Multiplication(int e,int f);
        {
            int mul=e*f;
            System.out.println("Multiplication of "+e+" , "+f" = "+mul);
        }

        static void Division(int x,int y);
        {
            int div=x/y;
            System.out.println("Division of "+x+" , "+y" = "+div);
        }

                public static int main(String[] args)
                {
                    Scanner s=new Scanner(System.in);

                    System.out.println("enter two numbers : ");
                    int n1=s.nextInt();
                    int n2=s.nextInt();

                    System.out.println("\nENTER A NUMBER OF CHOICE : \n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");

                    int l=s.nextInt();

                    switch (l) 
                    {
                        case 1:
                            Addition(n1,n2);
                            break;
                        
                        case 2:
                            Subtraction(n1,n2);
                            break;
                        
                        case 3:
                            Multiplication(n1,n2);
                            break;

                        case 4:
                            Division(n1,n2);
                            break;

                        default:
                            System.out.println("You entered a wrong choice.");
                            break;
                    }
                }
}