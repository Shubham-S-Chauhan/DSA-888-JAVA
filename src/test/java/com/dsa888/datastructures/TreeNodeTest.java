package com.dsa888.datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void testOf_null() {
        assertNull(TreeNode.of());
    }

    @Test
    void testOf_singleNode() {
        TreeNode root = TreeNode.of(1);
        assertNotNull(root);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

    @Test
    void testOf_levelOrder() {
        // Tree:  1
        //       / \
        //      2   3
        TreeNode root = TreeNode.of(1, 2, 3);
        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
    }

    @Test
    void testOf_withNulls() {
        // Tree:  1
        //         \
        //          3
        TreeNode root = TreeNode.of(1, null, 3);
        assertEquals(1, root.val);
        assertNull(root.left);
        assertEquals(3, root.right.val);
    }
}
