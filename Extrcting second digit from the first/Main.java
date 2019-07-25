#include <stdio.h>
int main() {
	int n,t;
      scanf("%d",&n);
  while(n>=100)
  {
    n=n/10;
  }
  t=n%10;
  printf("%d",t);
	return 0;
}