package com.dsa888.problems.dp;

/**
 * Problem: Climbing Stairs
 * Difficulty: Easy
 * Category: Dynamic Programming
 * Link: https://leetcode.com/problems/climbing-stairs/
 *
 * Description:
 *   You are climbing a staircase with n steps. Each time you can climb 1 or 2
 *   steps. In how many distinct ways can you climb to the top?
 *
 * Example:
 *   Input:  n = 5
 *   Output: 8
 *
 * Approach: DP (Fibonacci) – O(n) time, O(1) space
 */
public class P006_ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
