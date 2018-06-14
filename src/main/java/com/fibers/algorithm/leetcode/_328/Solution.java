package com.fibers.algorithm.leetcode._328;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode pOdd = head;
        ListNode pEven = head.next;
        ListNode pEvenHead = pEven;

        while(pEven != null && pEven.next != null){
            pOdd.next = pEven.next;
            pOdd = pOdd.next;
            pEven.next = pOdd.next;
            pEven = pEven.next;
        }
        pOdd.next = pEvenHead;
        return head;
    }
}
