package com.sapphire.leetcode.algorithm.question2;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class Fraction {
    public int[] fraction(int[] cont) {
        //a0 + 1/a1

        int[] nmTemp = new int[2];

        int a0 = cont[cont.length - 2];
        int a1 = cont[cont.length - 1];

        int m = a1;
        int n = a0 * a1 + 1;

        int gcd = gcd(nmTemp[0], nmTemp[1]);

        nmTemp[0] = n / gcd;
        nmTemp[1] = m / gcd;

        for (int i = cont.length - 3; i > 0; i--) {
            a0 = cont[i];

            int k = a0 * n + m;
            int j = n;

            gcd = gcd(nmTemp[0], nmTemp[1]);

            nmTemp[0] = n / gcd;
            nmTemp[1] = m / gcd;
        }

        return nmTemp;
    }

    // 20 15
    int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }

        if (x % y == 0) {
            return y;
        } else {
            return gcd(x % y, y);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 0, 2};


    }
}
