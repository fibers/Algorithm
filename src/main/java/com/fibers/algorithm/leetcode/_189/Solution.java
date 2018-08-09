package com.fibers.algorithm.leetcode._189;

public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        k = k % nums.length;

        if (k == 0) {
            return;
        }

        int len = nums.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[len - i - 1];
            nums[len - i - 1] = temp;
        }

        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }

        for (int i = k; i < (len + k) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[len + k - i - 1];
            nums[len + k - i - 1] = temp;
        }ByteBuffer
    }
}
