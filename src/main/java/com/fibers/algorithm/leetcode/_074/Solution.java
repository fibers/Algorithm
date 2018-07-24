package com.fibers.algorithm.leetcode._074;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int i = 0;
        int j = colLen - 1;

        while (i < rowLen) {
            if (target <= matrix[i][j]) {
                break;
            }
            i++;
        }

        if( i == rowLen ){
            return false;
        }

        while (j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            j--;
        }

        return false;
    }
}
