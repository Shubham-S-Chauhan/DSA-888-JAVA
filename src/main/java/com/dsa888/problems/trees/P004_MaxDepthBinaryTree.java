package com.dsa888.problems.trees;

import com.dsa888.datastructures.TreeNode;

/**
 * Problem: Maximum Depth of Binary Tree
 * Difficulty: Easy
 * Category: Trees / DFS
 * Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Description:
 *   Given the root of a binary tree, return its maximum depth.
 *
 * Example:
 *   Input:  root = [3,9,20,null,null,15,7]
 *   Output: 3
 *
 * Approach: Recursive DFS – O(n) time, O(h) space (h = height)
 */
public class P004_MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
