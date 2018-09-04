package com.fibers.algorithm.leetcode._633;

public class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }

        int i = 0;
        int j = (int) Math.ceil(Math.sqrt(c));

        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
