#include<stdio.h>
int main()
{
    int flag=0,i,n;

    printf("enter a number to find prime or not :");
    scanf("%d",&n);

    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }

    if(flag==0)
    {
        printf("number is PRIME");
    }
    else
    {
        printf("numeber is not PRIME");
    }
}