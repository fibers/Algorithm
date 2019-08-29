package com.fibers.algorithm.datastructure;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int t) {
        val = t;
    }

    public static ListNode valueOf(int[] ar) {
        if (ar == null || ar.length == 0) {
            return null;
        }

        ListNode head = new ListNode(ar[0]);
        ListNode p = head;
        for (int i = 1; i<ar.length ;i++) {
            ListNode temp = new ListNode(ar[i]);
            p.next = temp;
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println("aaaa");
    }

}
