package com.fibers.algorithm.leetcode._11;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r) {
            int minHeight = height[l] > height[r] ? height[r] : height[l];
            max = Math.max(max, minHeight * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
