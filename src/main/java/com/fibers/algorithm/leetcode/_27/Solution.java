package com.fibers.algorithm.leetcode._27;

public class Solution {

    public static void main(String[] args) {
        int nums[] = new int[]{0, 1, 2, 2, 3, 0, 4, 2};

        Solution s = new Solution();
        int len = s.removeElement(nums, 2);

        System.out.println(len);
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int first = 0;
        int last = nums.length - 1;

        while (first <= last) {

            if (nums[first] == val && nums[last] != val) {
                int temp = nums[first];
                nums[first] = nums[last];
                nums[last] = temp;
            } else if (nums[first] != val) {
                first++;
            } else {
                last--;
            }
        }

        return first;
    }
}
