package com.dsa888.problems.arrays;

/**
 * Problem: Two Sum
 * Difficulty: Easy
 * Category: Arrays / Hashing
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Description:
 *   Given an array of integers nums and an integer target, return indices of the
 *   two numbers such that they add up to target.
 *
 * Example:
 *   Input:  nums = [2, 7, 11, 15], target = 9
 *   Output: [0, 1]
 *
 * Approach: HashMap – O(n) time, O(n) space
 */
public class P001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
