package com.dsa888.datastructures;

/**
 * Definition for a singly-linked list node.
 * Used in LinkedList problems.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Build a linked list from an array (convenience helper). */
    public static ListNode of(int... values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : values) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    /** Convert linked list to array (convenience helper for tests). */
    public static int[] toArray(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) { size++; cur = cur.next; }
        int[] arr = new int[size];
        cur = head;
        for (int i = 0; i < size; i++) { arr[i] = cur.val; cur = cur.next; }
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        return sb.toString();
    }
}
