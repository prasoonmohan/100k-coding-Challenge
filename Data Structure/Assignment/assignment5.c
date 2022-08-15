//100k coding challenge
//assignment 4

/*write a program to show the grade obtained by a student
after he or she enters their total marks percentage */

#include<stdio.h>

int main()
{
    float mark;

    printf("enter your total mark percentage : ");
    scanf("%f",&mark);

    printf("YOUR GRADE IS : ");

if(mark>=90)
{
    printf("A");
}
else if(mark>=80&&mark<=89)
{
    printf("B");
}
else if(mark>=70&&mark<=79)
{
    printf("C");
}
else if(mark>=60&&mark<=69)
{
    printf("D");
}
else if(mark>=50&&mark<=59)
{
printf("E");
}
else
{
    printf("Failed");
}
}