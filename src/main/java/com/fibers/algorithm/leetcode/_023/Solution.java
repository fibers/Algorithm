package com.fibers.algorithm.leetcode._023;

import com.fibers.algorithm.datastructure.ListNode;
import com.fibers.utils.Utils;

public class Solution {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(5);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;

        ListNode l31 = new ListNode(2);
        ListNode l32 = new ListNode(6);
        l31.next = l32;

        ListNode[] lists = new ListNode[]{l11, l21, l31};

        Solution s = new Solution();
        ListNode result = s.mergeKLists(lists);

        Utils.printListNode(result);

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        if (lists == null || lists.length == 0) {
            return head.next;
        }

        while (true) {
            int index = compare(lists);
            if (index == -1) {
                return head.next;
            }
            ListNode node = lists[index];

            p.next = node;
            lists[index] = node.next;

            p = p.next;
        }
    }

    private int compare(ListNode[] lists) {

        int index = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < min) {
                min = lists[i].val;
                index = i;
            }
        }

        return index;
    }
}
