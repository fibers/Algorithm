package com.fibers.algorithm.leetcode._31;

import com.fibers.utils.Utils;

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int i = nums.length - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }

        if (i - 1 >= 0) {
            int target = nums[i - 1];
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] > target) {
                    Utils.swap(nums, j, i - 1);
                    break;
                }
            }
        }

        Utils.reverseArray(nums, i, nums.length - 1);

    }


}
