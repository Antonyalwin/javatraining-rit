#include <stdio.h>

int getLeastDigit(int number) {
    return number % 10;
}

int getLeastTens(int number) {
    return (number / 10) % 10;
}

int getLeastHundreds(int number) {
    return number / 100;
}

int getMaxDigit(int number1, int number2, int number3) {
    int maxDigit = 0;

    if (number1 % 10 >= maxDigit)
        maxDigit = number1 % 10;
    if ((number1 / 10) % 10 >= maxDigit)
        maxDigit = (number1 / 10) % 10;
    if (number1 / 100 >= maxDigit)
        maxDigit = number1 / 100;

    if (number2 % 10 >= maxDigit)
        maxDigit = number2 % 10;
    if ((number2 / 10) % 10 >= maxDigit)
        maxDigit = (number2 / 10) % 10;
    if (number2 / 100 >= maxDigit)
        maxDigit = number2 / 100;

    if (number3 % 10 >= maxDigit)
        maxDigit = number3 % 10;
    if ((number3 / 10) % 10 >= maxDigit)
        maxDigit = (number3 / 10) % 10;
    if (number3 / 100 >= maxDigit)
        maxDigit = number3 / 100;

    return maxDigit;
}

int createPIN(int input1, int input2, int input3) {
    int units = getLeastDigit(input1) < getLeastDigit(input2) ? (getLeastDigit(input1) < getLeastDigit(input3) ? getLeastDigit(input1) : getLeastDigit(input3)) : (getLeastDigit(input2) < getLeastDigit(input3) ? getLeastDigit(input2) : getLeastDigit(input3));
    int tens = getLeastTens(input1) < getLeastTens(input2) ? (getLeastTens(input1) < getLeastTens(input3) ? getLeastTens(input1) : getLeastTens(input3)) : (getLeastTens(input2) < getLeastTens(input3) ? getLeastTens(input2) : getLeastTens(input3));
    int hundreds = getLeastHundreds(input1) < getLeastHundreds(input2) ? (getLeastHundreds(input1) < getLeastHundreds(input3) ? getLeastHundreds(input1) : getLeastHundreds(input3)) : (getLeastHundreds(input2) < getLeastHundreds(input3) ? getLeastHundreds(input2) : getLeastHundreds(input3));
    int maxDigit = getMaxDigit(input1, input2, input3);

    int pin = maxDigit * 1000 + hundreds * 100 + tens * 10 + units;
    return pin;
}

int main() {
    int input1, input2, input3;
    printf("Enter three input numbers: ");
    scanf("%d %d %d", &input1, &input2, &input3);

    int pin = createPIN(input1, input2, input3);
    printf("Generated PIN: %04d\n", pin);

    return 0;
}
