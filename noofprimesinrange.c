#include <stdio.h>

int isPrime(int num);

int countPrimesInRange(int input1, int input2) {
    int count = 0;
    
    for (int num = input1; num <= input2; num++) {
        if (isPrime(num)) {
            count++;
        }
    }
    
    return count;
}

int isPrime(int num) {
    if (num <= 1) {
        return 0;
    }
    
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
            return 0;
        }
    }
    
    return 1;
}

int main() {
    int input1, input2;
    printf("Enter the starting number: ");
    scanf("%d", &input1);
    printf("Enter the ending number: ");
    scanf("%d", &input2);
    
    int result = countPrimesInRange(input1, input2);
    printf("The count of prime numbers in the specified range is: %d\n", result);
    
    return 0;
}
