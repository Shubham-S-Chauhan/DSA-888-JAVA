package com.dsa888.problems.greedy;

/**
 * Problem: Jump Game
 * Difficulty: Medium
 * Category: Greedy
 * Link: https://leetcode.com/problems/jump-game/
 *
 * Description:
 *   Given an integer array nums where nums[i] is the maximum jump length at
 *   position i, return true if you can reach the last index.
 *
 * Example:
 *   Input:  nums = [2,3,1,1,4]
 *   Output: true
 *
 * Approach: Greedy (track max reachable index) – O(n) time, O(1) space
 */
public class P018_JumpGame {

    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
