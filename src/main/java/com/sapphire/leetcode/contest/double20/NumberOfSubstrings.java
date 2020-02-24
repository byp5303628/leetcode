package com.sapphire.leetcode.contest.double20;

import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class NumberOfSubstrings {
    public int numberOfSubstrings(String s) {
        Queue<Integer> aStack = new ArrayDeque<Integer>();
        Queue<Integer> bStack = new ArrayDeque<Integer>();
        Queue<Integer> cStack = new ArrayDeque<Integer>();

        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (array[i] == 'a') {
                aStack.add(i);
            } else if (array[i] == 'b') {
                bStack.add(i);
            } else {
                cStack.add(i);
            }
        }

        int total = 0;
        int len = s.length();
        while (!aStack.isEmpty() && !bStack.isEmpty() && !cStack.isEmpty()) {
            int a = aStack.peek();
            int b = bStack.peek();
            int c = cStack.peek();

            int max = a > b ? Math.max(a, c) : Math.max(b, c);
            int min = a > b ? Math.min(b, c) : Math.min(a, c);

            if (a == min) {
                aStack.poll();
            } else if (b == min) {
                bStack.poll();
            } else {
                cStack.poll();
            }

            total += len - max;
        }

        return total;
    }

    public static void main(String[] args) {
        String s = "abcabc";

        int result = new NumberOfSubstrings().numberOfSubstrings(s);
        Assert.assertTrue(result == 10);
    }
}
