#include <stdio.h>

// Function to check if a number is stable
int isStable(int num) {
    int digit_count[10] = {0}; // to count the occurrence of each digit (0-9)
    
    while (num > 0) {
        int digit = num % 10;
        digit_count[digit]++;
        num /= 10;
    }
    
    int first_digit_count = 0;
    for (int i = 0; i < 10; i++) {
        if (digit_count[i] > 0) {
            if (first_digit_count == 0) {
                first_digit_count = digit_count[i];
            } else {
                if (digit_count[i] != first_digit_count) {
                    return 0; // Not stable if any digit count is different from the first one
                }
            }
        }
    }
    
    return 1; // All digits have the same count, so the number is stable
}

// Function to find the password
int findPassword(int input1, int input2, int input3, int input4, int input5) {
    int stable_sum = 0, unstable_sum = 0;
    int inputs[5] = {input1, input2, input3, input4, input5};
    
    for (int i = 0; i < 5; i++) {
        if (isStable(inputs[i])) {
            stable_sum += inputs[i];
        } else {
            unstable_sum += inputs[i];
        }
    }
    
    return stable_sum - unstable_sum; // Calculate and return the password
}


