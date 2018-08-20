package com.fibers.algorithm.leetcode._025;

import com.fibers.algorithm.datastructure.ListNode;
import com.fibers.utils.Utils;

public class Solution {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        ListNode l15 = new ListNode(5);
        ListNode l16 = new ListNode(6);
        ListNode l17 = new ListNode(7);

        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;
        l16.next = l17;

        Solution s = new Solution();
        ListNode result = s.reverseKGroup(l11, 3);

        Utils.printListNode(result);

    }


    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode prevGroupLast = new ListNode(-1);
        prevGroupLast.next = head;

        ListNode root = prevGroupLast;
        ListNode cur = prevGroupLast.next;
        ListNode curGroupFirst = null;
        ListNode prev = null;
        int i = 0;

        while (cur != null) {
            ListNode next = cur.next;
            if (i < k) {
                if (i == 0) {
                    curGroupFirst = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = next;
                i++;
            } else {
                prevGroupLast.next = prev;
                prevGroupLast = curGroupFirst;
                i = 0;
                prev = null;
            }
        }

        if( i< k){
            cur = prev;
            prev = null;

            while (cur != null) {
                ListNode next = cur.next;
                cur.next = prev;

                prev = cur;
                cur = next;
            }

            prevGroupLast.next = curGroupFirst;
        }else{
            prevGroupLast.next = prev;
        }

        return root.next;
    }
}
