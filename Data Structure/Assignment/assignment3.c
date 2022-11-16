/*100k coding challenge*/
//assignment3

//calculate simple interest

// simple interset = ( principle amount * interest rate * year)/100
#include<stdio.h>

int main (void)
{
    int p;               //principl amount
    float r;            //interest rate
    float n;            //number of years
    float si=0.0;         //simple interest

printf("enter the amount(principal amount) :");  
scanf("%d",&p);

printf("enter the interest :");
scanf("%f",&r);

printf("enter the number of years :");
scanf("%f",&n);

si=(p*r*n)/100;

printf("simple interest is :%f",si);

}
