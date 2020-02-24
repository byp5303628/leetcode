package com.sapphire.leetcode.contest.double20;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class BinarySort {
    public int[] sortByBits(int[] arr) {
        List<Num> list = new ArrayList<Num>(arr.length);

        for (int i : arr) {
            list.add(new Num(i));
        }

        Collections.sort(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i).x;
        }

        return arr;
    }

    private static int bit(int num) {
        int count = 0;
        while (true) {
            if (num == 0) {
                return count;
            }
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
    }

    public static class Num implements Comparable<Num> {
        private int x;
        private int binaryBit;

        public Num(int x) {
            this.x = x;
            this.binaryBit = bit(x);
        }

        public int compareTo(Num o) {
            int temp = Integer.compare(binaryBit, o.binaryBit);
            if (temp == 0) {
                return Integer.compare(x, o.x);
            } else {
                return temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};

        int[] result = new BinarySort().sortByBits(array);

        Assert.assertNotNull(result);
    }
}
