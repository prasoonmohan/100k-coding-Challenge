#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int array1[100],limit1,array2[100],i,limit2,temp;
    printf("enter the array 1 limit :");
    scanf("%d",&limit1);
    printf("enter the array 2 limit :");
    scanf("%d",&limit2);

    printf("enter the %d values of array 1 :",limit1);
    for(i=0;i<limit1;i++)
    {
    scanf("%d",&array1[i]);
    }
    
    printf("enter the %d values of array 2 :",limit2);
    for(i=0;i<limit2;i++)
    {
        scanf("%d",&array2[i]);
    }

    for(i=0;i<limit1&&i<limit2;i++)
    {
        temp=array1[i];
        array1[i]=array2[i];
        array2[i]=temp;
    }

    printf("ARRAY 1 IS :");
    for(i=0;i<limit1;i++)
    {
    printf("%d\t",array1[i]);
    }

    printf("ARRAY 2 IS :");
    for(i=0;i<limit2;i++)
    {
    printf("%d\t",array2[i]);
    }

}