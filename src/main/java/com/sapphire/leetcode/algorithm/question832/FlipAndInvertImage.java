package com.sapphire.leetcode.algorithm.question832;

/**
 * Author: 柏云鹏
 * Date: 2019/5/23.
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] array : A) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }

            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
