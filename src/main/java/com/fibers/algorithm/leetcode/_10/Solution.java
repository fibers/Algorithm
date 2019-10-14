package com.fibers.algorithm.leetcode._10;

/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */
// @lc code=start
class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isMatch("ab", ".*"));
    }

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return s == p;
        }

        int sLen = s.length();
        int pLen = p.length();

        boolean dp[][] = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;

        for (int j = 2; j <= pLen; j++) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }

        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
                    } else if (p.charAt(j - 2) != s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        return dp[sLen][pLen];
    }
}
// @lc code=end
