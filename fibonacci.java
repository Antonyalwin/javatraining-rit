public long nthFibonacci(int input1) {
    if (input1 == 1) {
        return 0;
    } else if (input1 == 2) {
        return 1;
    } else {
        long previous = 0;
        long current = 1;
        long result = 0;
        
        for (int i = 3; i <= input1; i++) {
            result = previous + current;
            previous = current;
            current = result;
        }
        
        return result;
    }
}
