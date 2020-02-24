package com.sapphire.leetcode.question9;

/**
 * Author: 柏云鹏
 * Date: 2020/2/24.
 */
public class IntPalindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
