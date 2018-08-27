package com.fibers.algorithm.leetcode._039;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        backtracking(result, list, candidates, target, 0);

        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                backtracking(result, list, candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }
}
