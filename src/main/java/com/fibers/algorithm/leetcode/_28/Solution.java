package com.fibers.algorithm.leetcode._28;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.strStr("mississippi", "issip"));
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() == 0) {
            return 0;
        }

        int len = haystack.length();
        int needleLen = needle.length();

        if (len == 0 || needleLen > len) {
            return -1;
        }

        char firstChar = needle.charAt(0);
        int maxIndex = len - needleLen;

        for (int i = 0; i <= maxIndex; i++) {
            if (haystack.charAt(i) != firstChar) {
                while (++i <= maxIndex && haystack.charAt(i) != firstChar) {
                }
            }

            if (i <= maxIndex) {
                int j = i + 1;
                int end = j + needleLen - 1;
                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k);
                     j++, k++) {
                }
                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }
}
