#include <stdio.h>

int intOddDigitsSum(int input1) {
    int num = input1;
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        
        if (digit % 2 != 0) {
            sum += digit;
        }

        num /= 10;
    }

    return sum;
}

int main() {
    int number1 = 9625;
    int number2 = 2134;

    int result1 = intOddDigitsSum(number1);
    int result2 = intOddDigitsSum(number2);

    printf("OddDigitsSum of %d: %d\n", number1, result1);
    printf("OddDigitsSum of %d: %d\n", number2, result2);

    return 0;
}
