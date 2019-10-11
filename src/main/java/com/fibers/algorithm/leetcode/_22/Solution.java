package com.fibers.algorithm.leetcode._22;

import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {

        String s = "";
        int left = n;
        int right = n;
        List<String> result = new ArrayList<>();

        generate(result, s, left, right);

        return result;
    }

    private void generate(List<String> list, String s, int left, int right){
        if(left == 0 && right == 0){
            list.add(s);
            return;
        }

        if(left > 0){
            generate(list, s+'(', left - 1, right);
        }

        if(right > left){
            generate(list, s+')', left, right - 1);
        }

        return;
    }
}
