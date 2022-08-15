#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int a[100],limit,i,sum=0;

    printf("enter a limit : ");
    scanf("%d",&limit);

    for(i=0;i<limit;i++)
    {
       
        scanf("%d",&a[i]);
    }
     for(i=0;i<limit;i++)
    {
        sum=sum+a[i];
    }
printf("sum of array = %d",sum);
return EXIT_SUCCESS;
}