package com.fibers.algorithm.leetcode._046;

import com.fibers.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};

        Solution s = new Solution();

        List<List<Integer>> list = s.permute(nums);
        for (List<Integer> tempList : list) {
            for (Integer i : tempList) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }
        permuteRecursion(nums, 0, nums.length - 1, list);
        return list;
    }

    private void permuteRecursion(int[] nums, int start, int end, List<List<Integer>> result) {

        if (start == end) {
            List<Integer> temp = new ArrayList();
            for (int i : nums) {
                temp.add(i);
            }
            result.add(temp);
            return;
        }

        for (int i = start; i <= end; i++) {
            Utils.swap(nums, start, i);
            permuteRecursion(nums, start + 1, end, result);
            Utils.swap(nums, start, i);
        }
        return;
    }
}