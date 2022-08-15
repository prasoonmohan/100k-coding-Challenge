#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int i,j,n;

    printf("enter a number of rows to print star :");
    scanf("%d",&n);

    for(i=n;i>=0;i--)
    {
        for(j=1;j<=i;j++)
        {
            printf(" * ");
        }
        printf("\n");
    }

}