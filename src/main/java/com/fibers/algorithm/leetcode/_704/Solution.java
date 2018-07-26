package com.fibers.algorithm.leetcode._704;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
