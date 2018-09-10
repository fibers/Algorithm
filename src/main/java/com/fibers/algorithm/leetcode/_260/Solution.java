package com.fibers.algorithm.leetcode._260;

public class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{0, 0};
        }

        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }

        int lastSetBit = (xor & (xor - 1)) ^ xor;
        int[] result = new int[2];
        for (int i : nums) {
            if ((i & lastSetBit) == 0) {
                result[0] ^= i;
            } else {
                result[1] ^= i;
            }
        }

        return result;
    }
}

