#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int i;
    for(i=0;i<=10;i++)
    {
        printf("\nhello");
        if(i==5)
        {
            break;
        }
        printf("\n\nworld");
    }
    printf("\n\nfinished");
}