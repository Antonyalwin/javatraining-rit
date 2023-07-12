public class Factorial {

    public static int factorial(int input1) {
        if (input1 == 0) {
            return 1;
        } else {
            return input1 * factorial(input1 - 1);
        }
    }

    public static void main(String[] args) {
        int input1 = 5;
        int factorial = factorial(input1);
        System.out.println("The factorial of " + input1 + " is " + factorial);
    }
}
