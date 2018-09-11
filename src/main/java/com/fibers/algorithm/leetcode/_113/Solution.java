package com.fibers.algorithm.leetcode._113;

import com.fibers.algorithm.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, new ArrayList<>(), root, sum);
        return result;
    }


    private void backtracking(List<List<Integer>> result, List<Integer> list, TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        list.add(root.val);

        if(root.left == null && root.right == null && sum == root.val){
            result.add(new ArrayList<>(list));

        }else{
            backtracking(result, list, root.left, sum - root.val);
            backtracking(result, list, root.right, sum - root.val);
        }
        list.remove(list.size() - 1);
    }
}

