#include <stdio.h>

int EvenDigitsSum(int input1) {
    int sum = 0;
    int digit;
    while (input1 > 0) {
        digit = input1 % 10;
        if (digit % 2 == 0) {
            sum += digit;
        }
        input1 /= 10;
    }
    return sum;
}

int main() {
    int input1 = 9625;
    int sum = EvenDigitsSum(input1);
    printf("The EvenDigitsSum for the number %d is %d\n", input1, sum);
    return 0;
}
