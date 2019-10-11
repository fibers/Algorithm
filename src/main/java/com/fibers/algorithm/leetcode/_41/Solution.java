package com.fibers.algorithm.leetcode._41;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }

        int minPositive = Integer.MAX_VALUE;
        // int maxContinuousPositive = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i < minPositive && i > 0) {
                minPositive = i;
            }
        }

        return minPositive;
    }
}
