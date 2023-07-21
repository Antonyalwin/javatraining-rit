#include<stdio.h>
int digitRemove_Palin(int input1)
{
  // Initialize the variables
  int xor = 0;
  int temp = input1;
  int lastDigit = 0;

  // Calculate the XOR of the digits
  while (temp > 0)
  {
    lastDigit = temp % 10;
    xor = xor ^ lastDigit;
    temp = temp / 10;
  }

  // Check if the number is already a palindrome
  if (xor == 0)
  {
    return -1;
  }

  // Find the rightmost digit that does not match the XOR
  while (input1 > 0)
  {
    lastDigit = input1 % 10;
    if (lastDigit != xor)
    {
      return lastDigit;
    }
    input1 = input1 / 10;
  }

  // The number is not a palindrome
  return -1;
}
