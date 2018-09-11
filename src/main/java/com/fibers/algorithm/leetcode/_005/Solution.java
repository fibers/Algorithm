package com.fibers.algorithm.leetcode._005;

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return s;
        }

        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int left = 0;
        int right = 0;
        int max = 0;

        for(int i = 0; i<len; i++){
            dp[i][i] = true;
            for(int j = 0; j<i ; j++){
                // dp[j][i] = (s.charAt(i) == s.charAt(j) && ( i-j < 2 || dp[j+1][i-1]));

                if(s.charAt(i) == s.charAt(j)){
                    if(i-j < 2){
                        dp[j][i] = true;
                    }else{
                        dp[j][i] = dp[j+1][i-1];
                    }
                }else{
                    dp[j][i] = false;
                }

                if(dp[j][i] && i-j + 1 > max){
                    max = i-j+1;
                    left = j;
                    right = i;
                }
            }
        }
        return s.substring(left, right + 1);
    }
}
