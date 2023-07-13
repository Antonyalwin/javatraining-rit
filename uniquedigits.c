#include <stdio.h>

int uniqueDigitsCount(int input1) {
  int uniqueDigitsCount = 0;
  int seen[10] = {0};

  while (input1 > 0) {
    int digit = input1 % 10;
    if (seen[digit] == 0) {
      seen[digit] = 1;
      uniqueDigitsCount++;
    }
    input1 /= 10;
  }

  return uniqueDigitsCount;
}




