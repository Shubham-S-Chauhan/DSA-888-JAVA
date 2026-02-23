package com.dsa888.problems.graphs;

/**
 * Problem: Number of Islands
 * Difficulty: Medium
 * Category: Graphs / DFS / BFS
 * Link: https://leetcode.com/problems/number-of-islands/
 *
 * Description:
 *   Given an m x n 2D binary grid which represents a map of '1's (land) and
 *   '0's (water), return the number of islands.
 *
 * Example:
 *   Input:
 *     grid = [["1","1","0","0","0"],
 *             ["1","1","0","0","0"],
 *             ["0","0","1","0","0"],
 *             ["0","0","0","1","1"]]
 *   Output: 3
 *
 * Approach: DFS flood-fill – O(m*n) time, O(m*n) space
 */
public class P005_NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') return;
        grid[r][c] = '0'; // mark visited
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
