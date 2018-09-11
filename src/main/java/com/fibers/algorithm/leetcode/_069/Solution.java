package com.fibers.algorithm.leetcode._069;

public class Solution {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int l = 1;
        int r = x;
        int result = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid <= x / mid) {
                l = mid + 1;
                result = mid;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }
}

