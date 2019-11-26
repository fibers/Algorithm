package com.fibers.algorithm.leetcode._144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import com.fibers.algorithm.datastructure.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> s = new Stack<>();
        s.push(root);

        while (!s.empty()) {
            TreeNode t = s.pop();
            result.add(t.val);

            if (t.right != null) {
                s.push(t.right);
            }

            if (t.left != null) {
                s.push(t.left);
            }
        }

        return result;
    }
}
// @lc code=end

