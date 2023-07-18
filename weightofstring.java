package Day 7;

public class weightofstring {
    public class Main {
        public static void main(String[] args) {
            String input = "Hello World";
            int option = 1; 
            int result = weightOfString(input, option);
            System.out.println(result); 
        }
    
        public static int weightOfString(String input1, int input2) {
            String lowercaseInput = input1.toLowerCase();
            int weight = 0;
    
            for (int i = 0; i < lowercaseInput.length(); i++) {
                char c = lowercaseInput.charAt(i);
    
                if (Character.isAlphabetic(c)) {
                    int charWeight = c - 'a' + 1;
    
                    if (input2 == 1 || !isVowel(c)) {
                        weight += charWeight;
                    }
                }
            }
    
            return weight;
        }
    
        private static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }   
}
