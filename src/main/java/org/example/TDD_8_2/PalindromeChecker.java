package org.example.TDD_8_2;

public class PalindromeChecker {


    public boolean isPalindrome(String str) {
        // Null is not a palindrome
        if (str == null) {
            return false;
        }

        // Remove all non-alphanumeric characters and convert to lower case
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // If nothing alphanumeric remains, it's not a palindrome
        if (cleaned.isEmpty()) {
            return false;
        }

        // Two-pointer palindrome check
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}