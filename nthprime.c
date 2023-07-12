#include <stdio.h>

int nthPrime(int n) {
    int primes[1000];
    int current = 2;
    int count = 0;
    while (count < n) {
        int isPrime = 1;
        for (int i = 0; i < count; i++) {
            if (current % primes[i] == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime) {
            primes[count] = current;
            count++;
        }
        current++;
    }
    return primes[n - 1];
}

int main() {
    int n = 10;
    int prime = nthPrime(n);
    printf("The %dth prime number is %d\n", n, prime);
    return 0;
}
