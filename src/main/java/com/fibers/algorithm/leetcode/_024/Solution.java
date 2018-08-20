package com.fibers.algorithm.leetcode._024;

import com.fibers.algorithm.datastructure.ListNode;
import com.fibers.utils.Utils;

public class Solution {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;

        Solution s = new Solution();
        ListNode result = s.swapPairs(l11);

        Utils.printListNode(result);

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode parent = new ListNode(-1);
        parent.next = head;

        ListNode root = parent;

        ListNode prev = head;
        ListNode next = head.next;

        do {
            parent.next = next;

            prev.next = next.next;
            next.next = prev;

            parent = prev;
        } while ((prev = prev.next) != null && (next = prev.next) != null);

        return root.next;
    }
}
