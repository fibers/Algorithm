package com.fibers.algorithm.leetcode._738;

public class Solution {

    public int monotoneIncreasingDigits(int N) {
        String s = String.valueOf(N);
        char[] c = s.toCharArray();

        int len = c.length;
        int lastIncrease = len;
        for (int i = len - 2; i >= 0; i--) {
            if (c[i] > c[i+1]) {
                lastIncrease = i;
                c[lastIncrease]--;
            }
        }

        for(int i=lastIncrease + 1; i<len; i++ ){
            c[i] = '9';
        }

        return Integer.valueOf(String.valueOf(c));
    }
}
