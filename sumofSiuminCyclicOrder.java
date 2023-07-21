
public class SumOfSumsOfDigits {

    public static int sumOfSumsOfDigits(int input1) {
        int sum = 0;
        int temp = input1;
        int len = (int) Math.log10(input1) + 1;
        for (int i = 0; i < len; i++) {
            int currentSum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                currentSum += digit;
                temp /= 10;
            }
            sum += currentSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int input1 = 582109;
        int sum = sumOfSumsOfDigits(input1);
        System.out.println(sum);
    }
}
