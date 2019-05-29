package com.sapphire.leetcode.contest.contest138;

import java.util.Arrays;

/**
 * Author: 柏云鹏
 * Date: 2019/5/26.
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] array = new int[heights.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = heights[i];
        }

        Arrays.sort(array);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}
