package com.dsa888.problems.linkedlist;

import com.dsa888.datastructures.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P003_ReverseLinkedListTest {

    private final P003_ReverseLinkedList sol = new P003_ReverseLinkedList();

    @Test
    void testReverseList() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(sol.reverseList(head)));
    }

    @Test
    void testSingleElement() {
        ListNode head = ListNode.of(1);
        assertArrayEquals(new int[]{1}, ListNode.toArray(sol.reverseList(head)));
    }

    @Test
    void testNullInput() {
        assertNull(sol.reverseList(null));
    }
}
