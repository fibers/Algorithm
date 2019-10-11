package com.fibers.algorithm.leetcode._98;


import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }

        if (node.val < minValue || node.val > maxValue) {
            return false;
        }

        if ((node.val == minValue && node.left != null)
                || (node.val == maxValue && node.right != null)) {
            return false;
        }

        return isValidBST(node.left, minValue, node.val - 1)
                && isValidBST(node.right, node.val + 1, maxValue);
    }
}