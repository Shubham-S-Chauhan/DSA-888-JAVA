package com.dsa888.problems.linkedlist;

import com.dsa888.datastructures.ListNode;

/**
 * Problem: Reverse Linked List
 * Difficulty: Easy
 * Category: Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/
 *
 * Description:
 *   Given the head of a singly linked list, reverse the list, and return the
 *   reversed list.
 *
 * Example:
 *   Input:  head = [1,2,3,4,5]
 *   Output: [5,4,3,2,1]
 *
 * Approach: Iterative – O(n) time, O(1) space
 */
public class P003_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
