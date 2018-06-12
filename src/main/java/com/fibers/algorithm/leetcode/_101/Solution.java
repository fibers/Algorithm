package com.fibers.algorithm.leetcode._101;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        return (n1.val == n2.val)
                && isMirror(n1.left, n2.right)
                && isMirror(n1.right, n2.left);
    }
}
