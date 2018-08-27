package com.fibers.algorithm.leetcode._047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(true && false || true);
        System.out.println(false || true && false);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);
        backtracking(results, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return results;
    }

    private void backtracking(List<List<Integer>> results, List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            results.add(new ArrayList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            backtracking(results, list, nums, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
