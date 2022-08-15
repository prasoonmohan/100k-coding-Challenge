#include<stdio.h>
#include<stdlib.h>
int sum(int,int);
int main(void)
{
    int num1,num2,res;
    printf("enter 2 values :");
    scanf("%d%d",&num1,&num2);
    res=sum(num1,num2);
    printf("RESULT IS : %d",res);
}
int sum(int a,int b)
{
    int result;
    result=a+b;
    return result;
}
