public int seriesN(int a, int b, int c, int N) {
    return a + (N - 1) * (b - a) + (N - 2) * (c - b);
}

public static void main(String[] args) {
    // Example usage:
    int a1 = 1, b1 = 3, c1 = 6, N1 = 17;
    int result1 = seriesN(a1, b1, c1, N1);
    System.out.println("17th number in the series: " + result1);

    int a2 = 5, b2 = -2, c2 = -4, N2 = 14;
    int result2 = seriesN(a2, b2, c2, N2);
    System.out.println("14th number in the series: " + result2);
}