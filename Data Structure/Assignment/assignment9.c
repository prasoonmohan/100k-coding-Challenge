//100k coding challenge
//print number pattern

#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int i,j,limit;
    printf("enter a limit :");
    scanf("%d",&limit);

    for(i=1;i<=limit;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf(" %d ",j);
        }
        printf("\n");
    }
}