package com.fibers.algorithm.leetcode._7;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(123));
        System.out.println(s.reverse(-123));

    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int reminder = x % 10;
            int temp = result * 10 + reminder;
            if (temp / 10 != result) {
                return 0;
            }
            result = temp;
            x = x / 10;
        }
        return result;
    }
}
