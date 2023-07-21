import java.util.ArrayList;
import java.util.List;

public class WordIdentifier {
    public static List<String> identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase().replace("_", ""); // Convert input1 to lowercase and remove underscores
        input2 = input2.toLowerCase();

        String[] words = input2.split(":"); // Split the input2 string into words using colon as separator

        List<String> possibleWords = new ArrayList<>();

        // Iterate through each word in input2 and check if it contains the input1
        // string
        for (String word : words) {
            if (word.contains(input1)) {
                possibleWords.add(word.toUpperCase()); // Add the matching word (in uppercase) to the list
            }
        }

        return possibleWords;
    }

    public static void main(String[] args) {
        // Test case
        String input1 = "Fier";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailoroffer";

        List<String> possibleWords = identifyPossibleWords(input1, input2);
        System.out.println("Possible words: " + String.join(" ", possibleWords));
    }
}
