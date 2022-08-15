#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int a[100],i,limit,search;

    printf("enter a limti :");
    scanf("%d",&limit);

    printf("enter the values :");

    for(i=0;i<limit;i++)
    {
        scanf("%d",&a[i]);

    }
    printf("enter value to search :");
    scanf("%d",&search);

    for(i=0;i<limit;i++)
    {
        if(search==a[i])
        {
            printf("item found at %d position :",i+1);
            break;
            
        }
    }
}