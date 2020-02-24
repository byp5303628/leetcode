package com.sapphire.leetcode.question7;

import org.junit.Assert;

/**
 * Author: 柏云鹏
 * Date: 2020/2/24.
 */
public class IntReverse {
    public int reverse(int x) {
        boolean minus = x < 0;

        String s = String.valueOf(x);

        StringBuilder sb = new StringBuilder();
        boolean start = true;
        if (minus) {
            for (int i = s.length() - 1; i > 0; i--) {
                if (start && s.charAt(i) == '0') {
                    continue;
                }

                sb.append(s.charAt(i));
                start = false;
            }

            return - Integer.parseInt(sb.toString());
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (start && s.charAt(i) == '0') {
                    continue;
                }

                sb.append(s.charAt(i));
                start = false;
            }

            if (sb.length() == 0) {
                return 0;
            }

            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception e) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        int a = 1534236469;

        int b = new IntReverse().reverse(a);

        Assert.assertTrue(b == 1534236469);
    }
}
