package com.fibers.algorithm.leetcode._215;

import com.fibers.algorithm.datastructure.MinHeap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};

        Solution s = new Solution();
        System.out.println(s.findKthLargest(nums, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0 || k > nums.length) {
            return 0;
        }

        MinHeap h = new MinHeap(k);

        for (int i : nums) {
            h.force_push(i);
        }

        return h.top();
    }
}
