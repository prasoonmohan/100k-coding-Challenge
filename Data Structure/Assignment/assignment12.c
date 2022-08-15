#include<stdio.h>
#include<stdlib.h>
int main(void)
{
 int array[100],i,j,limit,temp;
 printf("enter the array limit :");
 scanf("%d",&limit);

 printf("enter the values of array :");
 for(i=0;i<limit;i++)
 {
     scanf("%d",&array[i]);
 }   

 for(i=0;i<limit;i++)
 {
     for(j=i+1;j<limit;j++)
     {
         if(array[i]<array[j])
         {
             temp=array[i];
             array[i]=array[j];
             array[j]=temp;
         }
     }
 }
 printf("\nARRAY IN DESCENDING ORDER :");
 for(i=0;i<limit;i++)
 {
     printf("\t%d",array[i]);
 }   

}