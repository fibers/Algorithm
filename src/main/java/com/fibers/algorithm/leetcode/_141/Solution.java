package com.fibers.algorithm.leetcode._141;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head.next;

        while (first != second) {
            if (second == null || second.next == null) {
                return false;
            }

            first = first.next;
            second = second.next.next;
        }
        return true;
    }
}
