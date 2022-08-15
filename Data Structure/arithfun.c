#include<stdio.h>
#include<stdlib.h>

int addition();

int subtraction(int n1,int n2);

void main()
{
    int add,sum,a,b,sub;

    add=addition();
    
    printf("enter two values for sub :");
    scanf("%d%d",&a,&b);

    sub=subtraction(a,b);

    printf("\nSUM = %d",add);
    printf("\nSUB = %d",sub);
}

int addition()
{
    int a,b,sum;

    printf("enter two values for add : ");
    scanf("%d%d",&a,&b);
    
    sum=a+b;
    return sum;
}

int subtraction(int n1,int n2)
{
    int sub;

    sub=n1-n2;
    return sub;

}