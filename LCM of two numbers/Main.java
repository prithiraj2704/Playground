#include <stdio.h>
int main()
{
  int a,b,i,x,n;
  scanf("%d%d",&a,&b);
  
    for(i=1;i<=a&&i<=b;++i)
    {
      if(a%i==0&&b%i==0)
      x=i;
    }
  n=(a*b)/x;
  printf("%d",n);
    
  

   return 0;
}