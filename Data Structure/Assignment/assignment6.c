//100k coding challenge
//assignment 4

//using the switch case write a program to accept an input from the user and output the days

#include<stdio.h>

int main()

{
    int a;
    printf("enter a number of week :");
    scanf("%d",&a);

    switch(a)
    {
        case 1:
        {
            printf("SUNDAY");
            break;
        }
        case 2:
        {
            printf("MONDAY");
            break;
        }
        case 3:
        {
            printf("TUESDAY");
            break;
        }
        case 4:
        {
            printf("WEDNESDAY");
            break;
        }
        case 5:
        {
            printf("THURSDAY");
            break;
        }
        case 6:
        {
            printf("FRIDAY");
            break;
        }
        case 7:
        {
            printf("SATURDAY");
            break;
        }
        default :
        {
            printf("you entered a wrong number ");
            break;
        }

    }
}