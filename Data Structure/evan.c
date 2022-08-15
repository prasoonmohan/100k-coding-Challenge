#include<stdio.h>
int main()
{
    int l,i;

    printf("---EVEN NUMBERS---");

    printf("\n\n enter a limit : ");
    scanf("%d",&l);

    for(i-2;i<=l;i++)
    {
        if(i%2==0)
        {
            printf("\n%d",i);
        }
    }
}