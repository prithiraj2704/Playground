// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,i,x;
  scanf("%d%d",&a,&b);
  
    for(i=1;i<=a&&i<=b;++i)
    {
      if(a%i==0&&b%i==0)
      x=i;
    }
  printf("%d",x);
    
  

   return 0;
}