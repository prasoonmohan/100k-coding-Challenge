//100 K CODING CHALLENGE
//interchange two array

#include<stdio.h>
#include<stdlib.h>
{
    int array1[100],array2[100],i,l1,l2,temp;
    printf("enter the limit of array1 :");
    scanf("%d",&l1);
    printf("enter the limit of array2 :");
    scanf("%d",&l2);

    printf("enter the array1 elements :");
    for(i=0;i<l1;i++)
    {
        scanf("%d",&array1[i]);
    }
    printf("enter the array2 elements :");
    for(i=0;i<l2;i++)
    {
        scanf("%d",&array2[i]);
    }

    for(i=0;i<l1+l2;i++)
    {
     temp=array1[i];
     array1[i]=array2[i];
     array2[i]=temp;
    }

    printf("ARRAY 1 IS :\n");
    for(i=0;i<l1;i++)
    {
        printf("\t%d",array1[i]);
    }
    printf("ARRAY 2 IS :\n");
    for(i=0;i<l2;i++)
    {
        printf("\t%d",array2[i]);
    }
}