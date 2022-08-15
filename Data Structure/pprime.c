#include<stdio.h>
int main()
{
    int count=0,i,n;

    printf("enter a number to check prime or not : ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)  /*for(i=2;i<n;i++)
                         {
                           if(n%i==0)
                            {
                              flag=1;
                              break;
                            }
                         }

                         if(flag==0)*/
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        printf("PRIME NUMBER");
    }
    else
    {
        printf("NOT PRIME NUMBER");
    }

}