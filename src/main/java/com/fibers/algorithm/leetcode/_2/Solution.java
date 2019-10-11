package com.fibers.algorithm.leetcode._2;


import com.fibers.algorithm.datastructure.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int val1 = l1 == null? 0: l1.val;
            int val2 = l2 == null? 0: l2.val;

            int reminder = (val1 + val2 + carry) % 10;
            temp.next = new ListNode(reminder);
            carry = (val1 + val2 + carry) / 10;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            temp = temp.next;
        }


        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return result.next;
    }
}