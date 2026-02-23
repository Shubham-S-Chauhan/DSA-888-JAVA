package com.dsa888.problems.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P002_ValidPalindromeTest {

    private final P002_ValidPalindrome sol = new P002_ValidPalindrome();

    @Test
    void testValidPalindrome() {
        assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void testInvalidPalindrome() {
        assertFalse(sol.isPalindrome("race a car"));
    }

    @Test
    void testEmptyString() {
        assertTrue(sol.isPalindrome(" "));
    }
}
