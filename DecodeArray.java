// Create a Result class to store the output values
class Result {
    public int output1;
    public int output2;

    public Result(int output1, int output2) {
        this.output1 = output1;
        this.output2 = output2;
    }

}

public Result findOriginalFirstAndSum(int[] input1, int input2) {
    int sum = input1[input2 - 1]; // The last element of input1 is the original value in the encoded array
    int firstNumber = 0;

    // Traverse the array in reverse order, starting from the second-to-last element
    for (int i = input2 - 2; i >= 0; i--) {
        // To find the original value of input1[i], we need to subtract the next value input1[i+1]
        // (which represents the original value of input1[i+1]) from the encoded value input1[i]
        input1[i] = input1[i] - input1[i + 1];

        // Update the sum of all original values
        sum += input1[i];
    }

    // The first element of the original array is the value at index 0 of the modified array
    firstNumber = input1[0];

    // Return the Result object containing the first number and the sum
    return new Result(firstNumber, sum);
}
