package com.fibers.algorithm.leetcode._345;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverseVowels("hello"));
    }

    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        String vowels = "aeiouAEIOU";

        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];

        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);

            if (vowels.indexOf(ci) == -1) {
                result[i++] = ci;
            } else if (vowels.indexOf(cj) == -1) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }
}
