//100 K CODING CHALLENGE
//interchange two array

#include<stdio.h>
#include<stdlib.h>
void main()
{
    int array1[100],array2[100],i,limit,temp;
    printf("enter the limit of array :");
    scanf("%d",&limit);
    

    printf("enter the array1 elements :");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&array1[i]);
    }
    printf("enter the array2 elements :");
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

    printf("ARRAY 1 IS :\n");
    for(i=0;i<limit;i++)
    {
        printf("\t%d",array1[i]);
    }
    printf("ARRAY 2 IS :\n");
    for(i=0;i<limit;i++)
    {
        printf("\t%d",array2[i]);
    }
}