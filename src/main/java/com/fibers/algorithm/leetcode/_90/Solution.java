package com.fibers.algorithm.leetcode._90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);
        backtracking(results, new ArrayList<Integer>(), nums, 0);
        return results;
    }

    private void backtracking(List<List<Integer>> results, List<Integer> list, int[] nums, int start) {
        results.add(new ArrayList(list));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtracking(results, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
