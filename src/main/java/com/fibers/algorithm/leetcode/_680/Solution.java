package com.fibers.algorithm.leetcode._680;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validPalindrome("eeccccbebaeeabebccceea"));
    }

    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int i = -1;
        int j = s.length();

        while (++i < --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }

        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}

