public int sumOfNonPrimeIndexValues(int[] input1, int input2)
{
  // Initialize the variables
  int sum = 0;
  boolean[] isPrime = new boolean[input2];

  // Mark the prime numbers
  for (int i = 2; i < input2; i++)
  {
    if (!isPrime[i])
    {
      for (int j = i * 2; j < input2; j += i)
      {
        isPrime[j] = true;
      }
    }
  }

  // Calculate the sum of the values at the non-prime indexes
  for (int i = 0; i < input2; i++)
  {
    if (!isPrime[i])
    {
      sum += input1[i];
    }
  }

  // Return the sum
  return sum;
}
