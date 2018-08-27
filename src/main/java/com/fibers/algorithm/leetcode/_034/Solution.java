package com.fibers.algorithm.leetcode._034;

import com.fibers.utils.Utils;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};

        Solution s = new Solution();
        Utils.printArray(s.searchRange(nums, 8));
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int median = (end + start) / 2;
            if (nums[median] > target) {
                end = median - 1;
            } else if (nums[median] < target) {
                start = median + 1;
            } else {
                if (nums[start] != target) {
                    start++;
                }
                if (nums[end] != target) {
                    end--;
                }
                if(nums[start] == target && nums[end] == target){
                    return new int[]{start, end};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
