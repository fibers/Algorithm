package com.fibers.algorithm.others;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 0; i < 10; i++) {
            System.out.println(s.fibonacci(i));
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
}
