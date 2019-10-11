package com.fibers.algorithm.leetcode._83;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode p = head;
        ListNode prev = head;

        while ((p = p.next) != null) {
            if (prev.val == p.val) {
                continue;
            }

            prev.next = p;
            prev = p;
        }
        prev.next = null;
        return head;
    }
}
