#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int num1[100][100],i,j,c1,c2,r1,r2,num2[100][100];

    printf("enter the array 1 colom and row :");
    scanf("%d%d",&c1,&r1);
    printf("enter the array 2 colom and row :");
    scanf("%d%d",&c2,&r2);


    printf("enter array 1 values : ");
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            scanf("%d",&num1[i][j]);
        }
        
    }
     printf("enter array 2 values : ");
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            scanf("%d",&num2[i][j]);
        }
        
    }

    printf("SUM OF TWO ARRAY IS : \n");

    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            printf("\t%d",num1[i][j]+num2[i][j]);
           
        }
        printf("\n");
    }
}
