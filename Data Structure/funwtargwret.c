#include<stdio.h>
#include<stdlib.h>
int sum();
int main(void)
{
    int res;
    res=sum();
    printf("SUM IS : %d",res);
}
int sum()
{
    int n1,n2,sum;
    printf("enter 2 numbers :");
    scanf("%d%d",&n1,&n2);

    sum=n1+n2;
    return sum;
}