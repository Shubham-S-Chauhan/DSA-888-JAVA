package com.dsa888.problems.trie;

/**
 * Problem: Implement Trie (Prefix Tree)
 * Difficulty: Medium
 * Category: Trie
 * Link: https://leetcode.com/problems/implement-trie-prefix-tree/
 *
 * Description:
 *   Implement the Trie class:
 *     - Trie() initializes the trie object.
 *     - void insert(String word) inserts the string word into the trie.
 *     - boolean search(String word) returns true if word is in the trie.
 *     - boolean startsWith(String prefix) returns true if any word starts with prefix.
 *
 * Approach: Array of 26 children per node – O(m) per operation (m = word length)
 */
public class P020_ImplementTrie {

    private final TrieNode root = new TrieNode();

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) node.children[idx] = new TrieNode();
            node = node.children[idx];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private TrieNode find(String s) {
        TrieNode node = root;
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return null;
            node = node.children[idx];
        }
        return node;
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
}
