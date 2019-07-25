#include <stdio.h>
#include <math.h>
int main() {
	int n,N,r=0,c=0,t=0;
  scanf("%d",&n);
  N=n;
  while(N>0){
    N=N/10;
    c=c+1;
  }
 N=n;
  while(n!=0){
    r=n%10;
    t=t+pow(r,c);
    n=n/10;
  }
  if(t==N)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}