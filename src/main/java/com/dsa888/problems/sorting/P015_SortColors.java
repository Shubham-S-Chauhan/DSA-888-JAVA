package com.dsa888.problems.sorting;

/**
 * Problem: Sort Colors (Dutch National Flag)
 * Difficulty: Medium
 * Category: Sorting / Two Pointers
 * Link: https://leetcode.com/problems/sort-colors/
 *
 * Description:
 *   Given an array nums with n objects colored red, white, or blue (0, 1, 2),
 *   sort them in-place so that objects of the same color are adjacent.
 *
 * Example:
 *   Input:  nums = [2,0,2,1,1,0]
 *   Output: [0,0,1,1,2,2]
 *
 * Approach: Dutch National Flag (3-way partition) – O(n) time, O(1) space
 */
public class P015_SortColors {

    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i]; nums[i] = nums[j]; nums[j] = tmp;
    }
}
