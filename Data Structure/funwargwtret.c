 #include<stdio.h>
 #include<stdlib.h>
 void sum(int,int);
 int main(void)
 {
   int a,b;
   printf("enter two values :");
   scanf("%d%d",&a,&b);
   sum(a,b);
 }

 void sum(int x,int y)
 {
     int sum;
     sum=x+y;

     printf("SUM = %d",sum);
 }