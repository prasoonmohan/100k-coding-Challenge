//swapping two numbers without using third variable

#include<stdio.h>

int main()
{
    int a=20,b=30;

    a=a+b; //swapping
    b=a-b;
    a=a-b;

    printf("a : %d",a);

    printf("b : %d",b);
}