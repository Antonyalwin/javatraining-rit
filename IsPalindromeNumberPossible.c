#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int isPalinNumPossible(int input1) {
    char inputStr[10];
    sprintf(inputStr, "%d", input1);

    int digitCount[10] = {0};

    int i = 0;
    while (inputStr[i] != '\0') {
        int digit = inputStr[i] - '0';
        digitCount[digit]++;
        i++;
    }

    int oddCount = 0;
    for (int i = 0; i < 10; i++) {
        if (digitCount[i] % 2 != 0) {
            oddCount++;
        }
    }

    if (oddCount <= 1) {
        return 2;
    } else {
        return 1;
    }
}

int main() {
    int number1 = 21251;
    int number2 = 2125;

    int result1 = isPalinNumPossible(number1);
    int result2 = isPalinNumPossible(number2);

    printf("Result for %d: %d\n", number1, result1);
    printf("Result for %d: %d\n", number2, result2);

    return 0;
}
