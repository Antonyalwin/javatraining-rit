public int digitsum(int input1) {
    int num = Math.abs(input1);

    while (num >= 10) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        num = sum;
    }

    return num * (input1 < 0 ? -1 : 1);
}
