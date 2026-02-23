package com.dsa888.datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void testOf_emptyInput() {
        assertNull(ListNode.of());
    }

    @Test
    void testOf_singleElement() {
        ListNode head = ListNode.of(42);
        assertNotNull(head);
        assertEquals(42, head.val);
        assertNull(head.next);
    }

    @Test
    void testOf_multipleElements() {
        ListNode head = ListNode.of(1, 2, 3);
        assertArrayEquals(new int[]{1, 2, 3}, ListNode.toArray(head));
    }

    @Test
    void testToArray_null() {
        assertArrayEquals(new int[]{}, ListNode.toArray(null));
    }

    @Test
    void testToString() {
        ListNode head = ListNode.of(1, 2, 3);
        assertEquals("1 -> 2 -> 3", head.toString());
    }
}
