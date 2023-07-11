#include <stdio.h>

int getLastDigit(int number) {
    int lastDigit = number % 10;
    return lastDigit;
}

int main() {
    int number = 12345;
    int lastDigit = getLastDigit(number);
    
    printf("The last digit of %d is %d\n", number, lastDigit);
    
    return 0;
}

