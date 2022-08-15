//100k coding challenge
//display multiplication table


#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int i,n;
    printf("enter a number to print multiplication table :");
    scanf("%d",&n);

    for(i=1;i<=10;i++)
    {
        printf("\n %d * %d = %d",i,n,i*n);
    }
}