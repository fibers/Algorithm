package com.fibers.algorithm.leetcode._234;

import com.fibers.algorithm.datastructure.ListNode;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode p = head;

        while(p != null){
            s.push(p.val);
            p = p.next;
        }

        while(head != null){
            if(head.val != s.pop().intValue()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
