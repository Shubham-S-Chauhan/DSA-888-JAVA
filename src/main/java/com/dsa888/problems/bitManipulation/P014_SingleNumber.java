package com.dsa888.problems.bitManipulation;

/**
 * Problem: Single Number
 * Difficulty: Easy
 * Category: Bit Manipulation
 * Link: https://leetcode.com/problems/single-number/
 *
 * Description:
 *   Given a non-empty array of integers nums, every element appears twice
 *   except for one. Find that single one.
 *
 * Example:
 *   Input:  nums = [2,2,1]
 *   Output: 1
 *
 * Approach: XOR – O(n) time, O(1) space
 */
public class P014_SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}
