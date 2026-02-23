package com.dsa888.problems.slidingWindow;

/**
 * Problem: Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Category: Sliding Window / Hashing
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Description:
 *   Given a string s, find the length of the longest substring without
 *   repeating characters.
 *
 * Example:
 *   Input:  s = "abcabcbb"
 *   Output: 3  (substring "abc")
 *
 * Approach: Sliding window with HashMap – O(n) time, O(min(n,m)) space
 */
public class P009_LongestSubstringNoRepeat {

    public int lengthOfLongestSubstring(String s) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
