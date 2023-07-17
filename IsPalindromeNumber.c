#include <stdio.h>

int isPalinNum(int input1) {
    int original = input1;
    int reverse = 0;
    int digit;
    while (input1 > 0) {
        digit = input1 % 10;
        reverse = reverse * 10 + digit;
        input1 /= 10;
    }
    return (original == reverse) ? 2 : 1;
}

int main() {
    int input1 = 1221;
    int result = isPalinNum(input1);
    printf("The number %d is %s a palindrome\n", input1, (result == 2) ? "a" : "not");
    return 0;
}
