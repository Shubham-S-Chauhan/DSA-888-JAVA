package com.dsa888.problems.stack;

/**
 * Problem: Valid Parentheses
 * Difficulty: Easy
 * Category: Stack
 * Link: https://leetcode.com/problems/valid-parentheses/
 *
 * Description:
 *   Given a string s containing just the characters '(', ')', '{', '}', '[' and
 *   ']', determine if the input string is valid.
 *
 * Example:
 *   Input:  s = "()[]{}"
 *   Output: true
 *
 * Approach: Stack – O(n) time, O(n) space
 */
public class P011_ValidParentheses {

    public boolean isValid(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
