#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int a[100],i,j,limit,temp;

    printf("enter a limit");
    scanf("%d",&limit);

    printf("enter the values :");
     for(i=0;i<limit;i++)
     {
         scanf("%d",&a[i]);
     }

     for(i=0;i<limit;i++)
     {
         for(j=i+1;j<limit;j++)
         {
             if(a[i]>a[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
     }
     printf("SORTED VALUES :");
     for(i=0;i<limit;i++)
     {
         printf("%d\t",a[i]);
     }
}
