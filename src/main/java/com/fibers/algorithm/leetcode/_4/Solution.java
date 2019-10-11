package com.fibers.algorithm.leetcode._4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sizeNums1 = nums1.length;
        int sizeNums2 = nums2.length;

        int totalSize = sizeNums1 + sizeNums2;

        int[] sortedArray = new int[totalSize];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sizeNums1 && j < sizeNums2) {
            if (nums1[i] <= nums2[j]) {
                sortedArray[k++] = nums1[i++];
            } else {
                sortedArray[k++] = nums2[j++];
            }
        }

        while (i < sizeNums1) {
            sortedArray[k++] = nums1[i++];
        }

        while (j < sizeNums2) {
            sortedArray[k++] = nums2[j++];
        }

        int indexMedian1 = (sizeNums1 + sizeNums2 - 1) / 2;
        int indexMedian2 = (sizeNums1 + sizeNums2) / 2;

        return (sortedArray[indexMedian1] + sortedArray[indexMedian2]) / 2.0;
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        return 0.0;
    }
}
