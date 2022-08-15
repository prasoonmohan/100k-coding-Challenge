#include<stdio.h>
#include<stdlib.h>

int main(void)
{
    int l,i,sum=0;
    printf("enter a number");
    scanf("%d",&l);

    for(i=1;i<=l;i=i+2)
    {
      sum=sum+i;
        
    }

    printf("Sum of odd numbers = %d",sum);
}