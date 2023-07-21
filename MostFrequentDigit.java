public int mostFrequentlyOccurringDigit(int[] input1, int input2) {

  // Initialize a variable to store the maximum frequency of any digit.
  int max_freq = 0;

  // Initialize a variable to store the most frequent digit.
  int most_frequent_digit = 0;

  // Iterate over the input array.
  for (int i = 0; i < input2; i++) {

    // Get the current digit.
    int digit = input1[i];

    // Increment the frequency of the current digit.
    int count = 1;
    for (int j = i + 1; j < input2; j++) {
      if (input1[j] == digit) {
        count++;
      }
    }

    // If the frequency of the current digit is more than the maximum frequency,
    // update the maximum frequency and the most frequent digit.
    if (count > max_freq) {
      max_freq = count;
      most_frequent_digit = digit;
    } else if (count == max_freq && digit > most_frequent_digit) {
      most_frequent_digit = digit;
    }
  }

  // Return the most frequent digit.
  return most_frequent_digit;
}
