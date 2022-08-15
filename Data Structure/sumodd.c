#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int sum=0,i,n;

    printf("enter a number : ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        if (i%2==0)
        {
            continue;
        }
        else
        {
            sum=sum+i;
        }
    }
    printf("sum of odd numbers : %d",sum);
}