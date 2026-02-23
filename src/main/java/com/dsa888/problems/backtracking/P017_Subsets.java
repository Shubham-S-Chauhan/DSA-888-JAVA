package com.dsa888.problems.backtracking;

/**
 * Problem: Subsets
 * Difficulty: Medium
 * Category: Backtracking
 * Link: https://leetcode.com/problems/subsets/
 *
 * Description:
 *   Given an integer array nums of unique elements, return all possible subsets
 *   (the power set). The solution set must not contain duplicate subsets.
 *
 * Example:
 *   Input:  nums = [1,2,3]
 *   Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * Approach: Backtracking – O(n * 2^n) time, O(n) stack space
 */
public class P017_Subsets {

    public java.util.List<java.util.List<Integer>> subsets(int[] nums) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(nums, 0, new java.util.ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start,
                           java.util.List<Integer> current,
                           java.util.List<java.util.List<Integer>> result) {
        result.add(new java.util.ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
