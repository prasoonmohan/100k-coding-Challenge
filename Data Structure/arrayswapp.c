#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int array1[100],limit,array2[100],i,temp;
    printf("enter the array limit :");
    scanf("%d",&limit);
   

    printf("enter the %d values of array 1 :",limit);
    for(i=0;i<limit;i++)
    {
    scanf("%d",&array1[i]);
    }
    
    printf("enter the %d values of array 2 :",limit);
    for(i=0;i<limit;i++)
    {
        scanf("%d",&array2[i]);
    }

    for(i=0;i<limit;i++)
    {
        temp=array1[i];
        array1[i]=array2[i];
        array2[i]=temp;
    }

    printf("ARRAY 1 IS :");
    for(i=0;i<limit;i++)
    {
    printf("%d\t",array1[i]);
    }

    printf("ARRAY 2 IS :");
    for(i=0;i<limit;i++)
    {
    printf("%d\t",array2[i]);
    }

}