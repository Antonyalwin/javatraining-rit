#include<stdio.h>
int main()
{
    int is_prime(int n) {
  if (n <= 1) {
    return 1;
  }

  for (int i = 2; i * i <= n; i++) {
    if (n % i == 0) {
      return 1;
    }
  }

  return 2;
}
}