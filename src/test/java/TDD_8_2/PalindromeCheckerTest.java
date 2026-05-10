package TDD_8_2;

import org.example.TDD_8_2.PalindromeChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PalindromeCheckerTest {

    private PalindromeChecker checker;

    @BeforeEach
    void setUp() {
        checker = new PalindromeChecker();
    }

    @Test
    @DisplayName("Simple palindrome should return true")
    void testSimplePalindrome() {
        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("level"));
        assertTrue(checker.isPalindrome("12321"));
    }

    @Test
    @DisplayName("Palindrome ignoring spaces, punctuation and case")
    void testPalindromeWithMixedFormat() {
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
        assertTrue(checker.isPalindrome("race a car"));
        assertTrue(checker.isPalindrome("Never odd or even"));
    }

    @Test
    @DisplayName("Non‑palindromes should return false")
    void testNonPalindrome() {
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("Java"));
    }

    @Test
    @DisplayName("Null or empty string should return false")
    void testNullOrEmpty() {
        assertFalse(checker.isPalindrome(null));
        assertFalse(checker.isPalindrome(""));
        assertFalse(checker.isPalindrome("   "));
    }

    @Test
    @DisplayName("Single character is always a palindrome")
    void testSingleCharacter() {
        assertTrue(checker.isPalindrome("a"));
        assertTrue(checker.isPalindrome("5"));
    }
}