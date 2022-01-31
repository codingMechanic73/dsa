/**
Time Complexity: O(N)
Space Complexity: O(1)
 */
class PalindromeUsingLoop {
    public static boolean isPalindrome(int n) {
        int number = n;
        int reverseNumber = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n /= 10;
        }

        return number == reverseNumber;
    }
}