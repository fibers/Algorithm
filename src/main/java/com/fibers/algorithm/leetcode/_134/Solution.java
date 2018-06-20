package com.fibers.algorithm.leetcode._134;

public class Solution {

    public static void main(String[] args) {
        int[] gas = new int[]{3,3,4};
        int[] cost = new int[]{3,4,4};

        Solution s = new Solution();
        System.out.println(s.canCompleteCircuit(gas, cost));

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int[] sub = new int[len];

        for (int i = 0; i < len; i++) {
            sub[i] = gas[i] - cost[i];
        }

        int index = 0;
        for (; index < len; index++) {
            int sum = 0;
            int j = index;
            for (; j < len + index; j++) {
                if (sum < 0) {
                    break;
                } else {
                    sum += sub[j % len];
                }
            }
            if (j == len + index && sum >= 0) {
                return index;
            }
        }

        return -1;
    }
}
