package com.fibers.algorithm.leetcode._104;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
