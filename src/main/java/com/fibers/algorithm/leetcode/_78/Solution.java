package com.fibers.algorithm.leetcode._78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        int n = nums.length;
        int max = 1 << n;

        for (int i = 0; i < max; i++) {

            List<Integer> list = new ArrayList<>();
            int idx = 0;
            int j = i;
            while (j > 0) {
                if ((j & 1) == 1) {
                    list.add(nums[idx]);
                }
                j = j >> 1;
                idx++;
            }
            results.add(list);
        }
        return results;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        dfs(results, new ArrayList<Integer>(), nums, 0);
        return results;
    }


    private void dfs(List<List<Integer>> results, List<Integer> temp, int[] nums, int start) {
        results.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(results, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
