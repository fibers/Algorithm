package com.fibers.algorithm.leetcode._172;

public class Solution {
    public int trailingZeroes(int n) {
        return n <= 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}

