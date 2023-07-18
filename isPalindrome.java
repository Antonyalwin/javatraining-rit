class UserMainCode {
    public int isPalindrome(String input1) {
        String lowercaseInput = input1.toLowerCase();
        int length = lowercaseInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (lowercaseInput.charAt(i) != lowercaseInput.charAt(length - 1 - i)) {
                return 1; // Not a palindrome
            }
        }

        return 2; // Palindrome
    }
}
