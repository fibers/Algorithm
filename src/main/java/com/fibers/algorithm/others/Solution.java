package com.fibers.algorithm.others;

import com.fibers.utils.Utils;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        for (int i = 0; i < 10; i++) {
            System.out.println(s.fibonacci(i));
        }

        int[] a = new int[]{2, 4, 9, 4, 8, 3, 7, 9, 0, 7, 6, 5, 1};
        s.quickSort(a, 0, a.length - 1);
        Utils.printArray(a);


        int b = 45;
        int c = b | (1 << (6 & 0x1F));
        int d = b | (1 << 6);


        System.out.println(c);
        System.out.println(d);

    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public void quickSort(int[] a, int start, int end) {
        if (a != null && start < end) {
            int pivot = partition(a, start, end);
            quickSort(a, pivot + 1, end);
            quickSort(a, start, pivot - 1);
        }

    }

    private int partition(int[] a, int start, int end) {
        int pivotValue = a[start];

        while (start < end) {
            while (start < end && a[end] >= pivotValue) {
                end--;
            }
            Utils.swap(a, start, end);

            while (start < end && a[start] <= pivotValue) {
                start++;
            }
            Utils.swap(a, start, end);
        }
        return start;
    }
}
