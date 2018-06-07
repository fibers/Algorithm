package com.fibers.algorithm.leetcode._013;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> map = new LinkedHashMap<String, Integer>() {
            {
                put("M", 1000);
                put("CM", 900);
                put("D", 500);
                put("CD", 400);
                put("C", 100);
                put("XC", 90);
                put("L", 50);
                put("XL", 40);
                put("X", 10);
                put("IX", 9);
                put("V", 5);
                put("IV", 4);
                put("I", 1);
            }
        };

        if (s == null || s.length() == 0) {
            return 0;
        }

        while (s.length() != 0) {
            for (String key : map.keySet()) {
                if (s.startsWith(key)) {
                    result += map.get(key);
                    s = s.substring(key.length());
                    break;
                }
            }
        }

        return result;
    }
}
