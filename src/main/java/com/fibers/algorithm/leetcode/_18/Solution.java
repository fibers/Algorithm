package com.fibers.algorithm.leetcode._18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fibers.utils.Utils;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        Utils.printNestList(s.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return results;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    if ((left != j + 1 && nums[left] == nums[left - 1])
                            || nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left++;
                    } else if ((right != nums.length - 1 && nums[right] == nums[right + 1])
                            || nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right--;
                    } else {
                        results.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // 满足条件的，进入下一次遍历
                        left++;
                        right--;
                    }
                }
            }
        }
        return results;
    }
}
// @lc code=end
