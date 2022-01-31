class PalindromeUsingRecursion {
    public static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static int reverse(int number, int reversedNumber) {
        if (number == 0) {
            return reversedNumber;
        }
        return reverse(number / 10, reversedNumber * 10 + number % 10);
    }
}