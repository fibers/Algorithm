package com.fibers.algorithm.leetcode._141;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (first != null && second != null && second.next != null) {
            if (first == second) {
                return true;
            }

            first = first.next;
            second = second.next.next;
        }
        return false;
    }
}
