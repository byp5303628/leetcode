package com.sapphire.leetcode.contest.contest177;

import org.junit.Assert;

/**
 * Author: 柏云鹏
 * Date: 2020/2/23.
 */
public class ClosestDivisors {
    public int[] closestDivisors(int num) {
        int num1 = divide(num + 1);

        int result1 = (num + 1) / num1 - num1;

        int num2 = divide(num + 2);
        int result2 = (num + 2) / num2 - num2;

        return result1 < result2 ? new int[]{(num + 1) / num1, num1} : new int[]{(num + 2) / num2, num2};
    }

    int divide(int num) {
        double d = Math.sqrt(num);

        int i = (int) d;
        while (i > 1) {
            if (num % i == 0) {
                return i;
            } else {
                i--;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int num = 123;
        int[] result = new ClosestDivisors().closestDivisors(num);

        Assert.assertNotNull(result);
    }
}
