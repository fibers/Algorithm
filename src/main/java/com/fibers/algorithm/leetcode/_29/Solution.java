package com.fibers.algorithm.leetcode._29;


/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */
// @lc code=start
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.divide(-2147483648, 1));
    }

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean sign = (dividend ^ divisor) < 0;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;
        for (int i = 31; i >= 0; i--) {
            if ((absDividend >> i) >= absDivisor) {
                result += 1 << i;
                absDividend -= absDivisor << i;
            }
        }
        return sign ? 0 - result : result;
    }
}
// @lc code=end
