package com.dsa888.problems.hashing;

/**
 * Problem: Contains Duplicate
 * Difficulty: Easy
 * Category: Hashing
 * Link: https://leetcode.com/problems/contains-duplicate/
 *
 * Description:
 *   Given an integer array nums, return true if any value appears at least
 *   twice in the array, and return false if every element is distinct.
 *
 * Example:
 *   Input:  nums = [1,2,3,1]
 *   Output: true
 *
 * Approach: HashSet – O(n) time, O(n) space
 */
public class P013_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return true;
        }
        return false;
    }
}
