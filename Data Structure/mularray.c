#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int array[100][100],i,j,row,colom;

    printf("enter a size of ROW : ");
    scanf("%d",&row);

    printf("enter the size of COLOM :");
    scanf("%d",&colom);

    for(i=0;i<row;i++)
    {
        for(j=0;j<colom;j++)
        {
            printf("\nenter the %d %d table value :",i,j);
            scanf("%d",&array[i][j]);
        }
    }
    printf("RESULT :\n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<colom;j++)
        {
            
            printf("\t %d",array[i][j]);
        }
        printf("\n");
    }
}