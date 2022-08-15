//100k coding challenge
//assignment 4

/*write a program to check whether a student is pass or fail in subject
after he or she enters their marks*/

#include<stdio.h>
int main()
{
    float mark;

    printf("enter total marks (out of 100): ");
    scanf("%f",&mark);

    printf("you have entered %f mark out of 100.",mark);

    if(mark>=50)

{
printf("\nPassed");
}

else
{
printf("\nFailed");
}
}