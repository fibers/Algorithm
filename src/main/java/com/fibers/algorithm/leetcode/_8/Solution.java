package com.fibers.algorithm.leetcode._8;


public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("-2147483648"));
    }

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int len = str.length();
        boolean isPositive = true;

        int i = 0;
        while (i < len && str.charAt(i) == ' ') {
            i++;
        }

        if (i == len) {
            return 0;
        } else {
            char c = str.charAt(i);
            if (c == '+') {
                isPositive = true;
                i++;
            } else if (c == '-') {
                isPositive = false;
                i++;
            }
        }

        double result = 0;
        for (; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int n = Integer.parseInt(String.valueOf(c));
                result = result * 10 + n;

                if (isPositive && result > (double) Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                if (!isPositive && (0.0 - result) < (double) Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            } else {
                break;
            }
        }

        return isPositive ? (int) result : (int) (0 - result);
    }
}

