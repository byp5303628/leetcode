package com.sapphire.leetcode.contest.double20;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class CountOrders {
    public int countOrders(int n) {
        int[] array = new int[n];
        for (int i = 2; i < n; i++) {

        }

        return 0;
    }

    public int countOrders(int[] array, int n) {
        if (n == 1) {
            array[0] = 1;
            return 1;
        }

        if (array[n - 1] != 0) {
            return array[n - 1];
        }

        for (int i = 2; i <= n; i++) {
            array[i] = i * i;

            for (int j = i; j >= 2; j++) {
                array[i] += countOrders(array[j]) * j;
            }
        }

        return 0;
    }
}
