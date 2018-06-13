package com.fibers.algorithm.leetcode._033;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (start == end) {
                return target == nums[start] ? start : -1;
            }
            int mid = (start + end) / 2;
            if ((nums[mid] < nums[end] && (nums[mid] < target && target <= nums[end])) ||
                    ((nums[mid] < target || target <= nums[end]) && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
