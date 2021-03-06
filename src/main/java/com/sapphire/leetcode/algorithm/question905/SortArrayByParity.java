package com.sapphire.leetcode.algorithm.question905;

/**
 * Author: 柏云鹏
 * Date: 2019/5/22.
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i != j){
            if (A[i] % 2 == 0) {
                i++;
                continue;
            } else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            }
        }

        return A;
    }
}
