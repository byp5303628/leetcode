package com.sapphire.leetcode.algorithm.question461;

/**
 * Author: 柏云鹏
 * Date: 2019/5/20.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;

        int count = 0;
        while (z != 0) {
            if (z % 2 == 1) {
                count++;
            }

            z = z >> 1;
        }

        return count;
    }
}
