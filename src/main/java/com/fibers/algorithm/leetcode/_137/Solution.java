package com.fibers.algorithm.leetcode._137;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] sum = new int[32];
        Arrays.fill(sum, 0);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j < 32; j++) {
                sum[j] += num >> j & 1;
            }
        }

        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] % 3 != 0) {
                result += 1 << i;
            }
        }
        return result;
    }
}

