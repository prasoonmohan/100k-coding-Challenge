#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void)
{
    char string[100];
    int i,flag=0,len;

   printf("enter a string :");
   scanf("%s",&string);

   len=strlen(string);
   len--;

  for(i=0;i<len;i++)
  {
      if(string[i]!=string[len-i])
      {
          flag++;
          break;
      }
  }
  if(flag==0)
  {
      printf("STRING IS PALINDROME.");
  }
  else
  {
      printf("STRING IS NOT PALINDROME.");
  }

}