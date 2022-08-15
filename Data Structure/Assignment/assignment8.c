//100 k coding challenge
//sum of all odd numbers from a given limit

#include<stdio.h>
#include<stdlib.h>
int odd(int);
int main(void)
{
    int limit,sum;
    printf("enter a limit :");
    scanf("%d",&limit);

    sum=odd(limit);
    printf("SUM OF ODD NUMBERS : %d",sum);
}

int odd(int l)
{
    int odd=0,i;
    for(i=1;i<l;i++)
    {
        if(i%2==0)
        {
            continue;
        }
        else
        {
            odd=odd+i;
        }
    }
    return odd;
}