public class Result {
    public int output1; // Number of decreasing sequences
    public int output2; // Length of the longest decreasing sequence
}

public class UserMainCode {
    public static Result decreasingSeq(int[] input1, int input2) {
        Result result = new Result();
        int numDecreasingSeq = 0;
        int longestDecreasingSeq = 1;
        int currentSeqLength = 1;

        for (int i = 1; i < input2; i++) {
            if (input1[i] < input1[i - 1]) {
                currentSeqLength++;
                longestDecreasingSeq = Math.max(longestDecreasingSeq, currentSeqLength);
            } else {
                numDecreasingSeq += (currentSeqLength > 1) ? 1 : 0;
                currentSeqLength = 1;
            }
        }

        numDecreasingSeq += (currentSeqLength > 1) ? 1 : 0;

        result.output1 = numDecreasingSeq;
        result.output2 = longestDecreasingSeq;
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] input1 = { 11, 3, 1, 4, 7, 8, 12, 23, 7 };
        int input1Size = 9;
        Result result1 = decreasingSeq(input1, input1Size);
        System.out.println("Test Case 1 - Number of decreasing sequences: " + result1.output1);
        System.out.println("Test Case 1 - Length of the longest decreasing sequence: " + result1.output2);

        int[] input2 = { 5, 4, 3, 2, 1 };
        int input2Size = 5;
        Result result2 = decreasingSeq(input2, input2Size);
        System.out.println("Test Case 2 - Number of decreasing sequences: " + result2.output1);
        System.out.println("Test Case 2 - Length of the longest decreasing sequence: " + result2.output2);

        int[] input3 = { 1, 2, 3, 4, 5 };
        int input3Size = 5;
        Result result3 = decreasingSeq(input3, input3Size);
        System.out.println("Test Case 3 - Number of decreasing sequences: " + result3.output1);
        System.out.println("Test Case 3 - Length of the longest decreasing sequence: " + result3.output2);
    }
}
