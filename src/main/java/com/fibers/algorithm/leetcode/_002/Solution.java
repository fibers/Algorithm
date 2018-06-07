package com.fibers.algorithm.leetcode._002;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int reminder = (l1.val + l2.val + carry) % 10;
            temp.next = new ListNode(reminder);
            carry = (l1.val + l2.val + carry) / 10;

            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        if (l1 != null || l2 != null) {
            ListNode l = l1 == null ? l2 : l1;
            while (l != null) {
                int reminder = (l.val + carry) % 10;
                temp.next = new ListNode(reminder);
                carry = (l.val + carry) / 10;

                l = l.next;
                temp = temp.next;
            }
        }

        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return result.next;
    }
}