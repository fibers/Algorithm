package com.fibers.utils;

import com.fibers.algorithm.datastructure.ListNode;

import java.util.List;

public class Utils {
    public static void swap(int[] a, int idx1, int idx2) {
        if (idx1 != idx2) {
            int temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;
        }
    }

    public static void swap(ListNode a, ListNode b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    public static void swap(List<Integer> list, int idx1, int idx2) {
        if (idx1 != idx2) {
            Integer temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
        }
    }

    public static void printList(List<Integer> l) {
        if (l != null) {
            int len = l.size();
            for (int i = 0; i < len; i++) {
                System.out.print(l.get(i));
                if (i < len - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void printArray(int[] a) {
        if (a != null) {
            int len = a.length;
            for (int i = 0; i < len; i++) {
                System.out.print(a[i]);
                if (i < len - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

}
