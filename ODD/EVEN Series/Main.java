#include<stdio.h>
int main()
{
	int a,b,c;
  scanf("%d",&a);
  if(a%2==1)
  {
    b=(a+1)/2;
    c=2*(b-1);
    printf("%d",c);
  }
  else
  {
    b=a/2;
    c=b-1;
    printf("%d",c);
  }
  return 0;
  
	
}