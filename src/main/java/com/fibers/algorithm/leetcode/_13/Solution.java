package com.fibers.algorithm.leetcode._13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Integer> map = new HashMap<Character, Integer>() {
        /**
        *
        */
        private static final long serialVersionUID = 1L;

        {
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }
    };

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            Integer current = map.get(charArray[i]);
            if (i < charArray.length - 1) {
                Integer next = map.get(charArray[i + 1]);

                if (current >= next) {
                    result += current;
                } else {
                    result -= current;
                }
            } else {
                result += current;
            }
        }

        return result;
    }
}
