#include <stdio.h>

int nonRepeatDigitsCount(int input1) {
  int uniqueDigitsCount = 0;
  int seen[10] = {0};
  int digit;

  while (input1 > 0) {
    digit = input1 % 10;
    if (seen[digit] == 0) {
      seen[digit] = 1;
      uniqueDigitsCount++;
    } else {
      seen[digit] = -1;
    }
    input1 /= 10;
  }

  int nonRepeatedDigitsCount = 0;
  for (int i = 0; i < 10; i++) {
    if (seen[i] == 1) {
      nonRepeatedDigitsCount++;
    }
  }

  return nonRepeatedDigitsCount;
}


