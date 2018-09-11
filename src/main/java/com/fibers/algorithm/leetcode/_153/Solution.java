package com.fibers.algorithm.leetcode._153;

public class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                break;
            }
        }

        return i == nums.length ? nums[0] : nums[i];
    }
}

