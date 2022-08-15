#include<stdio.h>
#include<stdlib.h>

int getarray(int arr[100]);

int displayarray(int a[100],int l);

int main(void)
{
int array[100],l;

l=getarray(array);

displayarray(array,l);
}

int getarray(int arr[100])
{
    int i,l;
   
    printf("enter the array limit :");
    scanf("%d",&l);

    printf("enter the array values :\n");
    for(i=0;i<l;i++)
    {
        scanf("%d",&arr[i]);
    }
    return l;
}

int displayarray(int a[100],int l)
{
    
  printf("THE ARRAY IS :\n");
  for(int i=0;i<l;i++)
    {

        printf("%d\t",a[i]);
    }

}