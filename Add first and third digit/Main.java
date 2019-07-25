#include<stdio.h>
int main()
{
 int n,o,p,q;
 scanf("%d",&n);
 o=n/100;
 p=n%10;
 q=o+p;
 printf("%d",q);
 return 0;
}