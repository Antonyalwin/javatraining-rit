#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int intEvenOddDigitsSum(int input1, char* input2) {
    int num = input1;
    int sum = 0;
    int isEvenOption = strcmp(input2, "even") == 0;

    while (num > 0) {
        int digit = num % 10;
        int isEven = digit % 2 == 0;

        if ((isEvenOption && isEven) || (!isEvenOption && !isEven)) {
            sum += digit;
        }

        num /= 10;
    }

    return sum;
}

int main() {
    int number1 = 9625;
    char option1[] = "odd";

    int number2 = 2134;
    char option2[] = "even";

    int result1 = intEvenOddDigitsSum(number1, option1);
    int result2 = intEvenOddDigitsSum(number2, option2);

    printf("Even/Odd Digits Sum of %d (Option: %s): %d\n", number1, option1, result1);
    printf("Even/Odd Digits Sum of %d (Option: %s): %d\n", number2, option2, result2);

    return 0;
}
