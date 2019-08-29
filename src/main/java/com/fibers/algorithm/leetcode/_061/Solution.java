package com.fibers.algorithm.leetcode._061;

import com.fibers.algorithm.datastructure.ListNode;
import com.fibers.utils.Utils;

public class Solution {

    public static void main(String[] args) {
        ListNode head = ListNode.valueOf(new int[]{1,2,3,4,5});

        Solution s = new Solution();
        Utils.printListNode(s.rotateRight(head, 2));
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode p = head;
        ListNode tail = null;
        int size = 0;
        while (p != null) {
            size++;
            tail = p;
            p = p.next;
        }

        int index = size - k % size;
        p = head;
        while (--index > 0) {
            p = p.next;
        }

        tail.next = head;
        head = p.next;
        p.next = null;

        return head;
    }
}

