package com.fibers.algorithm.leetcode._160;

import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != null || pB != null) {
            if (pA == null) {
                headB = headB.next;
            } else {
                pA = pA.next;
            }
            if (pB == null) {
                headA = headA.next;
            } else {
                pB = pB.next;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
