#include <stdio.h>

int countDigit(int number, int digit) {
    int count = 0;
    
    while (number != 0) {
        int remainder = number % 10;
        
        if (remainder == digit) {
            count++;
        }
        
        number /= 10;
    }
    
    return count;
}

int MostFrequentDigit(int input1, int input2, int input3, int input4) {
    int digitCounts[10] = {0};
    int maxCount = 0;
    int mostFrequentDigit = -1;
    
    for (int digit = 0; digit <= 9; digit++) {
        digitCounts[digit] = countDigit(input1, digit) +
                             countDigit(input2, digit) +
                             countDigit(input3, digit) +
                             countDigit(input4, digit);
        
        if (digitCounts[digit] > maxCount) {
            maxCount = digitCounts[digit];
            mostFrequentDigit = digit;
        }
    }
    
    return mostFrequentDigit;
}

