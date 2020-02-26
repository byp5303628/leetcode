package com.sapphire.leetcode.algorithm.question27;

/**
 * Author: 柏云鹏
 * Date: 2020/2/26.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }

            nums[len] = nums[i];
            len++;
        }

        return len;
    }
}
