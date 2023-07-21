import java.util.Arrays;

public class EncodingThreeStrings {

    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String output1, String output2, String output3) {
            this.output1 = output1;
            this.output2 = output2;
            this.output3 = output3;
        }
    }

    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        String output1 = parts1[0] + parts2[0] + parts3[0];
        String output2 = parts1[1] + parts2[1] + parts3[1];
        String output3 = parts1[2] + parts2[2] + parts3[2];

        // Toggle the case of all characters in the third output string.
        output3 = toggleCase(output3);

        // Create a StringBuilder to hold the padded output string.
        StringBuilder paddedOutput3 = new StringBuilder(output3);

        // Calculate the number of spaces to pad the string with.
        int paddingLength = 3 - output3.length();

        // Pad the string with spaces.
        for (int i = 0; i < paddingLength; i++) {
            paddedOutput3.append(" ");
        }

        // Set the output3 variable to the padded string.
        output3 = paddedOutput3.toString();

        return new Result(output1, output2, output3);
    }

    private static String[] splitString(String input) {
        int length = input.length();
        int partsPerString = length / 3;
        int extraCharacters = length % 3;

        String[] parts = new String[3];

        for (int i = 0; i < 3; i++) {
            int partLength = partsPerString;
            if (i == 2 && extraCharacters > 0) {
                partLength++;
                extraCharacters--;
            }

            parts[i] = input.substring(i * partLength, (i + 1) * partLength);
        }

        return parts;
    }

    private static String toggleCase(String input) {
        StringBuilder output = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (Character.isLowerCase(character)) {
                output.append(Character.toUpperCase(character));
            } else {
                output.append(Character.toLowerCase(character));
            }
        }

        return output.toString();
    }

}
