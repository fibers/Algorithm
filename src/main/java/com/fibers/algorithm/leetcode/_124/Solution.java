package com.fibers.algorithm.leetcode._124;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {
    int maxValue;

    public static void main(String[] args) {
        Integer[] array = {-10, 11, 20, null, null, 15, 7};

        TreeNode t = new TreeNode(array);
        t.breadthFirstTravel();

        Solution s = new Solution();
        System.out.println(s.maxPathSum(t));
    }

    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }

    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
