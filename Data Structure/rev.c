#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    char str[100];
    
    printf("enter a string :");
    scanf("%s",&str);

    
    strrev(str);

    printf("%s",str);

}

   