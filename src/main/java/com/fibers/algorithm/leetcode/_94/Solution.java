package com.fibers.algorithm.leetcode._94;

import com.fibers.algorithm.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode t = root;

        while (t != null || !s.isEmpty()) {
            while (t != null) {
                s.push(t);
                t = t.left;
            }

            if (!s.isEmpty()) {
                TreeNode temp = s.pop();
                list.add(temp.val);
                if (temp.right != null) {
                    t = temp.right;
                }
            }
        }
        return list;
    }
}
