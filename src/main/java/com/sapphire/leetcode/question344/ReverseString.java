package com.sapphire.leetcode.question344;

/**
 * Author: 柏云鹏
 * Date: 2019/5/30.
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - 1 - i] = temp;
        }
    }
}
