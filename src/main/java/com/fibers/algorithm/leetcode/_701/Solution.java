package com.fibers.algorithm.leetcode._701;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        TreeNode t = root;
        TreeNode pre = null;
        while (t != null) {
            int temp = t.val;
            pre = t;
            if (val < temp) {
                t = t.left;
            }else{
                t = t.right;
            }
        }

        if(val < pre.val){
            pre.left = new TreeNode(val);
        }else{
            pre.right = new TreeNode(val);
        }

        return root;
    }
}
