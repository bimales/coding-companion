/*
 * A palindrome is a word, phrase, number, or other sequence of
 * characters that reads the same forward and backward
 * (ignoring spaces, punctuation, and capitalization).
 */


package org.coding.companion.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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


    @Test
    public void testPalindrome(){
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertTrue(isPalindrome("racecar"));
        Assertions.assertFalse(isPalindrome("hello"));
        Assertions.assertFalse(isPalindrome(null));
    }
}