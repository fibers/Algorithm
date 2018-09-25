package com.fibers.algorithm.others;

import com.fibers.utils.Utils;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        for (int i = 0; i < 10; i++) {
            System.out.println(s.fibonacci(i));
        }

        int[] ar = new int[]{2, 4, 9, 4, 8, 3, 7, 9, 0, 7, 6, 5, 1};
        s.quickSort(ar, 0, ar.length - 1);
        Utils.printArray(ar);


        System.out.println("Test Start");
        for (int i = -10000; i <= 10000; i++) {
            int a = i & -i;
            int b = i & (i - 1) ^ i;

            if (a != b) {
                System.out.println("Oops!");
            } else {
                System.out.println("Good!");
            }
        }
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
