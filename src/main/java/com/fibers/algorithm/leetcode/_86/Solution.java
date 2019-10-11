package com.fibers.algorithm.leetcode._86;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode p = dummy.next;
        ListNode partition = dummy;

        while (p != null) {
            if(p.val < x){
                prev.next = p.next;
                p.next = partition.next;
                partition.next = p;
                partition = partition.next;
            }
            prev = p;
            p = p.next;
        }
        return dummy.next;
    }
}

