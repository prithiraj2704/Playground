#include<stdio.h>
#include<math.h>
int main()
{
  int n,a,r,s1,s2,nterm;
  scanf("%d",&n);
  if(n%2==1)
  {
    r=2;
    s1=(n+1)/2;
    nterm=pow(r,s1-1);
    printf("%d",nterm);
  }
  else
  {
    r=3;
    s2=n/2;
    nterm = pow(r,s2-1);
    printf("%d",nterm);
  }
  return 0;
}