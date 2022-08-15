#include<stdio.h>
#include<stdlib.h>

int getArray();
void displayArray(int a[]);
int main()
{
int array[100];

array == getArray();

displayArray(array);

return 0;
}

int getArray()
{
    int arr[4]={1,2,3,4};
   

    return arr;
}

void displayArray(int a[])
{
    
  printf("THE ARRAY IS :\n",a);
  
}