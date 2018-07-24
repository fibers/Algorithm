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
        return permuteRecursion(new ArrayList<Integer>(), nums, 0);
    }

    private List<List<Integer>> permuteRecursion(List<Integer> tempList, int[] nums, int start) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (tempList.size() == nums.length) {
            resultList.add(tempList);
            return resultList;
        }

        for (int i = start; i <= nums.length - 1; i++) {
            Utils.swap(nums, start, i);
            tempList.add(nums[i]);
            List<List<Integer>> recursionList = permuteRecursion(tempList, nums, start + 1);
            resultList.addAll(recursionList);

            Utils.swap(nums, start, i);
        }

        return resultList;
    }
}