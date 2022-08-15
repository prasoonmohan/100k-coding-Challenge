#include<stdio.h>
#include<stdlib.h>
void sum();
int main(void)
{
sum();
sum();
}

void sum()
{
    int num1,num2,sum;
    printf("\nenter two numbers :");
    scanf("%d%d",&num1,&num2);

    sum=num1+num2;

    printf("RESULT = %d",sum);
}