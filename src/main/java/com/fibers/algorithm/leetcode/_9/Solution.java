package com.fibers.algorithm.leetcode._9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int palindrome = 0;
        while (x > palindrome) {
            palindrome = palindrome * 10 + x % 10;
            x /= 10;
        }

        return palindrome == x || palindrome == x / 10;
    }
}
