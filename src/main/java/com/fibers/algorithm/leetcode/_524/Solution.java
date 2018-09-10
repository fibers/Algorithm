package com.fibers.algorithm.leetcode._524;

import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)) {
                continue;
            }
            if(isValid(s, target)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isValid(String s, String target) {
        int i = 0;
        int j = 0;

        int iLen = s.length();
        int jLen = target.length();

        while (i < iLen && j < jLen) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == jLen;
    }


}

