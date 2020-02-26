package com.sapphire.leetcode.algorithm.question20;

import org.junit.Assert;

import java.util.Stack;

/**
 * Author: 柏云鹏
 * Date: 2020/2/24.
 */
public class ValidMatch {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            char c = stack.peek();
            char r = s.charAt(i);
            if (c == '(' && r == ')' || (c == '[' && r == ']') || (c == '{' && r == '}')) {
                stack.pop();
                continue;
            }

            stack.push(s.charAt(i));
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";

        Assert.assertTrue(new ValidMatch().isValid(s));
    }
}
