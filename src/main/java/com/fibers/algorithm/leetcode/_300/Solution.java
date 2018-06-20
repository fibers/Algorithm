package com.fibers.algorithm.leetcode._300;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {10,9,2,5,3,7,101,18};

        Solution s = new Solution();
        System.out.println(s.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int result = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            result = Math.max(dp[i], result);
        }
        return result;
    }

}
