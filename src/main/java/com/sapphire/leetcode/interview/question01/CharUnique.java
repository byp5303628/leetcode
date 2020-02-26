package com.sapphire.leetcode.interview.question01;

import org.junit.Assert;

/**
 * Author: 柏云鹏
 * Date: 2020/2/26.
 */
public class CharUnique {
    public boolean isUnique(String astr) {
        int[] aList = new int[] {0,0,0,0};

        for (int i = 0;i< astr.length();i++) {
            char c = astr.charAt(i);
            int b = (int) c / 32;
            int bb = (int) c % 32 + 1;

            int target = 1 << (bb - 1);
            if ((aList[b] & target) == target) {
                return false;
            } else {
                aList[b] += target;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abc";

        boolean result = new CharUnique().isUnique(s);

        Assert.assertTrue(result);
    }
}
