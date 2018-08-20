package com.fibers.algorithm.leetcode._029;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.divide(-1, 1));
    }

    public int divide(int dividend, int divisor) {
        boolean sign = (dividend > 0) ^ (divisor < 0);

        dividend = dividend > 0 ? dividend : 0 - dividend;
        divisor = divisor > 0 ? divisor : 0 - divisor;

        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        return sign ? result : 0 - result;
    }
}
