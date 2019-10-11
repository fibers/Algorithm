package com.fibers.algorithm.leetcode._6;

public class Solution {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        Solution solution = new Solution();

        System.out.println(solution.convert(s, numRows));
        System.out.println("aaaa");

        System.out.println("aaaa");

    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }

        int len = s.length();
        int base = 2 * (numRows - 1);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            int step = 0;
            int count = 0;
            while (index < len) {
                sb.append(s.charAt(index));
                if (i == 0 || i == numRows - 1) {
                    step = base;
                } else if (count % 2 == 0) {
                    step = base - 2 * i;
                } else {
                    step = 2 * i;
                }
                index += step;
                count++;
            }
        }
        return sb.toString();
    }
}
