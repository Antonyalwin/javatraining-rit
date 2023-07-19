public String addNumberStrings(String input1, String input2) {
    // Convert the input strings to character arrays for easier manipulation
    char[] num1 = input1.toCharArray();
    char[] num2 = input2.toCharArray();

    // Find the lengths of the input strings
    int len1 = num1.length;
    int len2 = num2.length;

    // Find the maximum length among the two input strings
    int maxLength = Math.max(len1, len2);

    // Create a StringBuilder to store the result
    StringBuilder sum = new StringBuilder();

    // Initialize carry as 0
    int carry = 0;

    // Traverse both input strings from right to left
    for (int i = 1; i <= maxLength; i++) {
        // Get the digit from the first number if it exists, otherwise set it to 0
        int digit1 = (len1 - i >= 0) ? (num1[len1 - i] - '0') : 0;
        
        // Get the digit from the second number if it exists, otherwise set it to 0
        int digit2 = (len2 - i >= 0) ? (num2[len2 - i] - '0') : 0;

        // Calculate the sum of the digits along with the carry
        int digitSum = digit1 + digit2 + carry;

        // Append the least significant digit of the sum to the result
        sum.insert(0, digitSum % 10);

        // Update the carry for the next iteration
        carry = digitSum / 10;
    }

    // If there's still a carry after the traversal, append it to the result
    if (carry > 0) {
        sum.insert(0, carry);
    }

    // Return the sum as a string
    return sum.toString();
}