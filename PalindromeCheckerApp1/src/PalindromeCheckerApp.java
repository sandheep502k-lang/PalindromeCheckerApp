/**
 * =====================================================
 * MAIN CLASS – UseCase9PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Check
 */

public class PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}