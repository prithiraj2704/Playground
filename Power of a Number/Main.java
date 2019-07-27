#include <stdio.h>
int main()
{
    int base, exponent,i;
    long long result=1;
    scanf("%d", &base);
    scanf("%d", &exponent);
    if(exponent>=0)
    {
      for(i=1;i<=exponent;i++)
      result=result*base;
    printf("%lld", result);
    }
  else
    printf("Wrong input");
    return 0;
}