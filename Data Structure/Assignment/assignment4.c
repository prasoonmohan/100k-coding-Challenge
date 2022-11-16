//100k coding challenge
//assignment 4

//  Write a program to check whether a student has passed or failed in a subject after he or she enters their mark (pass mark for a subject is 50 out of 100). 

#include<stdio.h>
void main(){
    float mark;
    char name[100];
    printf("enter your name : ");
    scanf("%s",&name);
    printf("hello %s enter your mark : ",name);
    scanf(" %f", &mark);
    
    if(mark >= 50 && mark <= 100){
        printf("%s your passed!😃",name);
    }
    else if(mark<=50&&mark>=0){
         printf("%s sorry your Failed😢",name);
    }
    else{
        printf("check your mark properly ⚠");
    }
}