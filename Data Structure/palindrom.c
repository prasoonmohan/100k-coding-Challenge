#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    char str[100],var[100];
    
    printf("enter a string :");
    scanf("%s",&str);

    
    rev[100]=strrev(str);

    if(rev==str)
    {
        printf("string is palinmdrom.");

    }
    else
    {
        printf("string is not palindrom.");
    }
}