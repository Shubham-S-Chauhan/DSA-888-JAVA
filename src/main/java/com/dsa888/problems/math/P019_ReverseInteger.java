package com.dsa888.problems.math;

/**
 * Problem: Reverse Integer
 * Difficulty: Medium
 * Category: Math
 * Link: https://leetcode.com/problems/reverse-integer/
 *
 * Description:
 *   Given a signed 32-bit integer x, return x with its digits reversed.
 *   If reversing x causes the value to go outside [-2^31, 2^31 - 1], return 0.
 *
 * Example:
 *   Input:  x = 123
 *   Output: 321
 *
 * Approach: Pop and push digits – O(log x) time, O(1) space
 */
public class P019_ReverseInteger {

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        return (int) result;
    }
}
