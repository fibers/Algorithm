package com.fibers.algorithm.leetcode._110;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {1,2,2,3,null,null,3,4,null,null,4};
        TreeNode t = new TreeNode(array);

        Solution s = new Solution();
        System.out.println(s.isBalanced(t));
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int lHeight = height(node.left);
        if(lHeight == -1){
            return -1;
        }

        int rHeight = height(node.right);
        if(rHeight == -1){
            return -1;
        }

        if(Math.abs(lHeight - rHeight) > 1){
            return -1;
        }

        return Math.max(lHeight, rHeight) + 1;
    }
}
