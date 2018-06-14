package com.fibers.algorithm.leetcode._237;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {

        if (node == null || node.next == null) {
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;

        return;
    }
}
