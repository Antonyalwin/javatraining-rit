#include<stdio.h>
int AllDigitsCount(int number) {
  int count = 0;
  while (number > 0) {
    count++;
    number = number / 10;
  }
  return count;
}

