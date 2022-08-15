#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int array[100],i,limit,count=0,evan[100];

    printf("enter the array limit : ");
    scanf("%d",&limit);

    printf("enter th values");

    for(i=0;i<limit;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=0;i<limit;i++)
    {
      if(array[i]%2==0)
      {   
        evan[i]=array[i];
          count++;
      }
      
    }
    printf(" THE EVEN NUMBERS IN GIVEN ARRAY IS : %d\n",count);

    printf("THE EVEN NUMBERS ARE : ");

    for(i=1;i<limit;i++)
    {
     printf("%d\n",evan[i]);
    }
}