package com.fibers.algorithm.leetcode._36;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String temp = "(" + board[i][j] + ")";
                    if (!set.add(i + temp) ||
                            !set.add(temp + j) ||
                            !set.add(i / 3 + temp + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
