package com.dsa888.problems.trees;

import com.dsa888.datastructures.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P004_MaxDepthBinaryTreeTest {

    private final P004_MaxDepthBinaryTree sol = new P004_MaxDepthBinaryTree();

    @Test
    void testDepth3() {
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        assertEquals(3, sol.maxDepth(root));
    }

    @Test
    void testDepth2() {
        TreeNode root = TreeNode.of(1, null, 2);
        assertEquals(2, sol.maxDepth(root));
    }

    @Test
    void testNullRoot() {
        assertEquals(0, sol.maxDepth(null));
    }
}
