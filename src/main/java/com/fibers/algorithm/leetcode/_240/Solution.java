package com.fibers.algorithm.leetcode._240;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int i = 0;
        int j = colLen - 1;

        while (i >= 0 && i < rowLen && j >= 0 && j < colLen) {
            int val = matrix[i][j];
            if (val == target) {
                return true;
            } else if (val > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
