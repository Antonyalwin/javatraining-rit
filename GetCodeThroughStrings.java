public int getCodeThroughStrings(String input1) {
    int totalLength = 0;
    int wordLength = 0;

    for (int i = 0; i < input1.length(); i++) {
        char c = input1.charAt(i);

        if (Character.isLetterOrDigit(c)) {
            wordLength++;
        } else if (wordLength > 0) {
            totalLength += wordLength;
            wordLength = 0;
        }
    }

    // Add the length of the last word, if any
    if (wordLength > 0) {
        totalLength += wordLength;
    }

    // Continuously add the digits of the total length till we get a single digit
    while (totalLength > 9) {
        int sum = 0;
        while (totalLength > 0) {
            sum += totalLength % 10;
            totalLength /= 10;
        }
        totalLength = sum;
    }

    // Return the single-digit numeric PIN
    return totalLength;
}