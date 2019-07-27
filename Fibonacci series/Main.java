#include<stdio.h>
int main()
{
  int a,x,y=0,z=1,i;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  { 
   printf("%d ",y);
    x=y+z;
    y=z;
    z=x;
    
  }
  return 0;
}