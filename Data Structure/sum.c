#include<stdio.h>
int main()
{
    int sum=0,n,i;

    printf("enter a limit");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    printf("sum =%d",sum);
}