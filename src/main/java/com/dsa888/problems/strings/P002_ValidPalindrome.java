package com.dsa888.problems.strings;

/**
 * Problem: Valid Palindrome
 * Difficulty: Easy
 * Category: Strings / Two Pointers
 * Link: https://leetcode.com/problems/valid-palindrome/
 *
 * Description:
 *   A phrase is a palindrome if, after converting all uppercase letters into
 *   lowercase letters and removing all non-alphanumeric characters, it reads
 *   the same forward and backward.
 *
 * Example:
 *   Input:  s = "A man, a plan, a canal: Panama"
 *   Output: true
 *
 * Approach: Two pointers – O(n) time, O(1) space
 */
public class P002_ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
