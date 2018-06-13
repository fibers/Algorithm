package com.fibers.algorithm.leetcode._108;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};
        Solution s = new Solution();
        TreeNode t = s.sortedArrayToBST(nums);
        t.breadthFirstTravel();
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return createTreeNode(nums, 0, nums.length - 1);
    }

    private TreeNode createTreeNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int index = (start + end) / 2;
        TreeNode t = new TreeNode(nums[index]);
        t.left = createTreeNode(nums, start, index - 1);
        t.right = createTreeNode(nums, index + 1, end);
        return t;
    }
}
