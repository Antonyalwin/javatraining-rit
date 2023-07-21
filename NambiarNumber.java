import java.util.Random;

public class NambiarNumberGenerator {

    public static int nGenerator(String input1) {
        int nambiarNumber = 0;
        int sum = 0;
        boolean firstDigitOdd = Character.isDigit(input1.charAt(0)) && (input1.charAt(0) - '0') % 2 == 1;
        for (int i = 0; i < input1.length(); i++) {
            if (Character.isDigit(input1.charAt(i))) {
                sum += input1.charAt(i) - '0';
            }
            if (firstDigitOdd ^ (sum % 2 == 1)) {
                nambiarNumber = nambiarNumber * 10 + sum;
                sum = 0;
                firstDigitOdd = !firstDigitOdd;
            }
        }
        return nambiarNumber;
    }

    public static void main(String[] args) {
        String input1 = "123456789";
        int nambiarNumber = nGenerator(input1);
        System.out.println("The Nambiar Number for " + input1 + " is " + nambiarNumber);
    }
}
