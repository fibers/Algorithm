package com.fibers.algorithm.leetcode._105;

import com.fibers.algorithm.datastructure.TreeNode;

public class Solution {

    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Solution s = new Solution();
        TreeNode t = s.buildTree(preorder, inorder);
        t.breadthFirstTravel();
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTreeNode(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode createTreeNode(int[] preorder, int preStart, int preEnd,
                                    int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int value = preorder[preStart];
        TreeNode t = new TreeNode(value);

        int indexInInorder = 0;
        int inorderLen = inorder.length;
        for (; indexInInorder < inorderLen; indexInInorder++) {
            if (inorder[indexInInorder] == value) {
                break;
            }
        }

        int leftTreeLen = indexInInorder - inStart;

        t.left = createTreeNode(preorder, preStart + 1, preStart + leftTreeLen
                , inorder, inStart, indexInInorder - 1);
        t.right = createTreeNode(preorder, preStart + leftTreeLen + 1, preEnd
                , inorder, indexInInorder + 1, inEnd);

        return t;
    }

}
