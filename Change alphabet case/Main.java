#include <stdio.h>
int main() {
	char x,y;
  scanf("%c",&x);
  if('a'<=x&&x<='z')
  {
    y=x-32;
    printf("%c",y);
  }
  else if('A'<=x&&x<='Z')
  {
    y=x+32;
    printf("%c",y);
  }
    return 0;
}