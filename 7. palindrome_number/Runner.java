import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (PalindromeUsingLoop.isPalindrome(n)) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

         if (PalindromeUsingRecursion.isPalindrome(n)) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}