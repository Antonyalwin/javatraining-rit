public class CrazyZak {
    public static int calculateNumber(String sentence) {
        String[] words = sentence.split(" ");
        int result = 0;

        for (String word : words) {
            int wordLength = word.length();
            int sum = 0;

            for (int i = 0; i < wordLength / 2; i++) {
                char firstChar = word.charAt(i);
                char lastChar = word.charAt(wordLength - 1 - i);
                int difference = Math.abs(firstChar - lastChar);
                sum += difference;
            }

            result = result * 10 + sum;
        }

        return result;
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        int number = calculateNumber(sentence);
        System.out.println("Number: " + number);
    }
}
