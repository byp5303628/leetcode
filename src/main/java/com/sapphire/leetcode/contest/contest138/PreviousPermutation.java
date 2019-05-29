package com.sapphire.leetcode.contest.contest138;


import org.junit.Assert;

/**
 * Author: 柏云鹏
 * Date: 2019/5/26.
 */
public class PreviousPermutation {
    public int[] prevPermOpt1(int[] A) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            int max = 0;
            int index = 0;
            for (int j = A.length - 1; j > i; j--) {
                if (num > A[j]) {
                    if (A[j] > max) {
                        max = A[j];
                        index = j;
                    }
                }
            }

            if (index > 0) {
                A[i] = A[index];
                A[index] = num;
                break;
            }
        }

        return A;
    }

    public static void main(String[] arg) {
        int[] array = new int[]{1, 1, 5};

        int[] result = new PreviousPermutation().prevPermOpt1(array);

        int[] array1 = new int[]{1, 9, 4, 6, 7};
        int[] result1 = new PreviousPermutation().prevPermOpt1(array1);

        System.out.println("su");
    }

}
