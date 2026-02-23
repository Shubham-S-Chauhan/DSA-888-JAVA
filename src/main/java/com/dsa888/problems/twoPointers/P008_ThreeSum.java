package com.dsa888.problems.twoPointers;

/**
 * Problem: 3Sum
 * Difficulty: Medium
 * Category: Two Pointers
 * Link: https://leetcode.com/problems/3sum/
 *
 * Description:
 *   Given an integer array nums, return all the triplets [nums[i], nums[j],
 *   nums[k]] such that i != j, i != k, and j != k, and
 *   nums[i] + nums[j] + nums[k] == 0.
 *
 * Example:
 *   Input:  nums = [-1,0,1,2,-1,-4]
 *   Output: [[-1,-1,2],[-1,0,1]]
 *
 * Approach: Sort + Two Pointers – O(n^2) time, O(1) extra space
 */
public class P008_ThreeSum {

    public java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(java.util.Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
