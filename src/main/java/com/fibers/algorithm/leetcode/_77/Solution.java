package com.fibers.algorithm.leetcode._77;

import com.fibers.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        Utils.printNestList(s.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        backtracking(result, list, n, k, 1);

        return result;
    }


    private void backtracking(List<List<Integer>> result, List<Integer> list, int n, int k, int start) {

        if (k < 0) {
            return;
        } else if (k == 0) {
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = start; i <= n; i++) {
                list.add(i);
                backtracking(result, list, n, k - 1, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
