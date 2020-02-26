package com.sapphire.leetcode.algorithm.question136;

import java.util.Arrays;

/**
 * Author: 柏云鹏
 * Date: 2019/6/16.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            if (i == (nums.length - 1)) {
                return nums[i];
            }

            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
