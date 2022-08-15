//NUMBER OF EVEN NUMBERS IN A ARRAY

#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int array[100],i,even=0,limit;
     printf("enter array limit :");
     scanf("%d",&limit);

    printf("enter the array elements :");
     for(i=0;i<limit;i++)
     {
         scanf("%d",&array[i]);
     }
     for(i=0;i<limit;i++)
     {
         if(array[i]%2==0)
         {
             even++;
         }
     }
     printf("EVEN NUMBERS IN ARRAY IS : %d",even);
}