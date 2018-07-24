package com.fibers.algorithm.leetcode._022;

import java.util.*;

public class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();

        if (n == 1) {
            set.add("()");
        } else if (n > 1) {
            List<String> tempList = generateParenthesis(n - 1);
            for (String s : tempList) {
                set.add(s + "()");
                set.add("()" + s);
                set.add("(" + s + ")");
            }

        }

        return new ArrayList<>(set);
    }
}
