package com.dsa888.problems.queue;

/**
 * Problem: Implement Queue using Stacks
 * Difficulty: Easy
 * Category: Queue / Stack
 * Link: https://leetcode.com/problems/implement-queue-using-stacks/
 *
 * Description:
 *   Implement a first in first out (FIFO) queue using only two stacks.
 *
 * Approach: Two stacks (lazy transfer) – amortized O(1) per operation
 */
public class P012_QueueUsingStacks {

    java.util.Deque<Integer> inbox  = new java.util.ArrayDeque<>();
    java.util.Deque<Integer> outbox = new java.util.ArrayDeque<>();

    public void push(int x) {
        inbox.push(x);
    }

    public int pop() {
        transfer();
        return outbox.pop();
    }

    public int peek() {
        transfer();
        return outbox.peek();
    }

    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    private void transfer() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
        }
    }
}
