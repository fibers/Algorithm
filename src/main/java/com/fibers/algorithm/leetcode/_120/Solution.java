package com.fibers.algorithm.leetcode._120;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        triangle.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        triangle.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        triangle.add(list3);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        triangle.add(list4);

        s.minimumTotal(triangle);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
            return 0;
        }

        int rowLen = triangle.size();
        int[] dp = new int[rowLen + 1];

        for (int i = rowLen - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
