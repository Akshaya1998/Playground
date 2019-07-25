#include<stdio.h>
int main()
{
  int year,x;
  scanf("%d",&year);
  x=year%4;
  if(x==0){
    printf("Leap year");
  }
  else{
    printf("Not Leap year");
  }
  return 0;
}