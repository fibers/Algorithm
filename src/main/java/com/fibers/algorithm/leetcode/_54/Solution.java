package com.fibers.algorithm.leetcode._54;

import com.fibers.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        Solution s = new Solution();
        List<Integer> result = s.spiralOrder(matrix);

        Utils.printList(result);
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null) {
            return result;
        }

        this.spiral(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1, result);
        return result;
    }

    private void spiral(int[][] matrix, int startX, int startY, int endX, int endY, List<Integer> result) {

        for (int i = startY; i <= endY; i++) {
            result.add(matrix[startX][i]);
        }
        for (int i = startX + 1; i <= endX - 1; i++) {
            result.add(matrix[i][endY]);
        }
        for (int i = endY; i >= startY; i--) {
            result.add(matrix[endX][i]);
        }
        for (int i = endX - 1; i >= startX + 1; i--) {
            result.add(matrix[i][startY]);
        }

        if (startX > endX && startY > endY) {
            this.spiral(matrix, startX + 1, startY + 1, endX - 1, endY - 1, result);
        }
    }
}
