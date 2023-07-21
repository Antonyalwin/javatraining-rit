public class Main {
    public static int sumOfPowerOfDigits(int input1) {
        // Convert the given number to a string to access individual digits
        String numStr = Integer.toString(input1);

        // Initialize a variable to store the result
        int result = 0;

        // Iterate through the digits from left to right
        for (int i = 0; i < numStr.length(); i++) {
            // Convert the current digit to an integer
            int digit = Character.getNumericValue(numStr.charAt(i));

            // Calculate the power of the current digit to the power of the next digit
            // If the current digit is the last digit, the next digit is considered as 0.
            int nextDigit = (i == numStr.length() - 1) ? 0 : Character.getNumericValue(numStr.charAt(i + 1));
            int power = (int) Math.pow(digit, nextDigit);

            // Add the calculated power to the result
            result += power;
        }

        return result;
    }

    public static void main(String[] args) {
        int inputNumber = 582109;
        int sumOfPowers = sumOfPowerOfDigits(inputNumber);
        System.out.println("Sum of Powers of Digits: " + sumOfPowers); // Output: 390693
    }
}
