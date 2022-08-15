public class MulArray
{
    public static void main(String[] args)
    {
        int  num[][]={{10,20,30,40},{100,200,300,400}},i,j;

        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(num[i][j]+"\t");
            }

            System.out.println(" ");
        }
        
    }
}