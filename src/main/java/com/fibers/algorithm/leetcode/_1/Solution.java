package com.fibers.algorithm.leetcode._1;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            Integer sub = Integer.valueOf(target - nums[i]);
            if (map.containsKey(sub)) {
                return new int[]{i, map.get(sub)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
// @lc code=end
