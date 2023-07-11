public static int isMultiple(int n, int m) {
  // If either of the parameters are zero, return 3.
  if (n == 0 || m == 0) {
    return 3;
  }

  // Check if n is an exact multiple of m.
  if (n % m == 0) {
    return 2;
  } else {
    return 1;
  }
}
