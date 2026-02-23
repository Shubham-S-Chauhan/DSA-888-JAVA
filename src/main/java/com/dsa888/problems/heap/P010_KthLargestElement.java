package com.dsa888.problems.heap;

/**
 * Problem: Kth Largest Element in an Array
 * Difficulty: Medium
 * Category: Heap / Priority Queue
 * Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
 *
 * Description:
 *   Given an integer array nums and an integer k, return the kth largest
 *   element in the array.
 *
 * Example:
 *   Input:  nums = [3,2,1,5,6,4], k = 2
 *   Output: 5
 *
 * Approach: Min-heap of size k – O(n log k) time, O(k) space
 */
public class P010_KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}
