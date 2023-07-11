#include <stdio.h>

int getSecondLastDigit(int number) {
    int secondLastDigit = (number / 10) % 10;
    return secondLastDigit;
}

int main() {
    int number = 12345;
    int secondLastDigit = getSecondLastDigit(number);
    
    printf("The second last digit of %d is %d\n", number, secondLastDigit);
    
    return 0;
}

