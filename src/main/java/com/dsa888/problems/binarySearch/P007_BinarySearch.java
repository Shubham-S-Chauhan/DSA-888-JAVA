package com.dsa888.problems.binarySearch;

/**
 * Problem: Binary Search
 * Difficulty: Easy
 * Category: Binary Search
 * Link: https://leetcode.com/problems/binary-search/
 *
 * Description:
 *   Given an array of integers nums which is sorted in ascending order, and an
 *   integer target, write a function to search target in nums. If target exists
 *   then return its index. Otherwise, return -1.
 *
 * Example:
 *   Input:  nums = [-1,0,3,5,9,12], target = 9
 *   Output: 4
 *
 * Approach: Classic binary search – O(log n) time, O(1) space
 */
public class P007_BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
