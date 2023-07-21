public int AddSub(int input1, int input2)
{
  // Validate the input
  if (input1 < 1 || input1 > 10000)
  {
    throw new ArgumentException("Invalid input");
  }

  // Initialize the result
  int result = input1;

  // Iterate from N-1 to 1, adding or subtracting the current number depending on the option
  for (int i = input1 - 1; i >= 1; i--)
  {
    if (input2 == 1)
    {
      result -= i;
    }
    else
    {
      result += i;
    }
  }

  // Return the result
  return result;
}
