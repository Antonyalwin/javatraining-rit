#include<stdio.h>
int main()
{
    int countEvens(int number1, int number2, int number3, int number4, int number5) {
  int count = 0;
  if (number1 % 2 == 0) {
    count++;
  }
  if (number2 % 2 == 0) {
    count++;
  }
  if (number3 % 2 == 0) {
    count++;
  }
  if (number4 % 2 == 0) {
    count++;
  }
  if (number5 % 2 == 0) {
    count++;
  }
  return count;
}
}
