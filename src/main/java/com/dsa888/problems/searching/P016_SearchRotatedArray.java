package com.dsa888.problems.searching;

/**
 * Problem: Search in Rotated Sorted Array
 * Difficulty: Medium
 * Category: Searching / Binary Search
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 * Description:
 *   Given the array nums after the possible rotation and an integer target,
 *   return the index of target if it is in nums, or -1 if it is not in nums.
 *
 * Example:
 *   Input:  nums = [4,5,6,7,0,1,2], target = 0
 *   Output: 4
 *
 * Approach: Modified Binary Search – O(log n) time, O(1) space
 */
public class P016_SearchRotatedArray {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            // left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                // right half is sorted
                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
