/*
 * A palindrome is a word, phrase, number, or other sequence of
 * characters that reads the same forward and backward
 * (ignoring spaces, punctuation, and capitalization).
 */

public class Palindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // Null is not a palindrome
        }

        // Normalize the string: Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "racecar";
        String test3 = "hello";
        String test4 = null;

        System.out.println("\"" + test1 + "\" is a palindrome: " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is a palindrome: " + isPalindrome(test2));
        System.out.println("\"" + test3 + "\" is a palindrome: " + isPalindrome(test3));
        System.out.println("null string is a palindrome: " + isPalindrome(test4));
    }
}