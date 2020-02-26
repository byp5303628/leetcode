package com.sapphire.leetcode.algorithm.question26;

/**
 * Author: 柏云鹏
 * Date: 2020/2/26.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[pos]) {
                continue;
            }

            nums[result] = nums[i];
            result += 1;
            pos = i;
        }
        return result;
    }
}
