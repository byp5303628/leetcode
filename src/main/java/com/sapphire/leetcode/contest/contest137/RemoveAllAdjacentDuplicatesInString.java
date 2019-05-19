package com.sapphire.leetcode.contest.contest137;

import java.util.Stack;

/**
 * Author: 柏云鹏
 * Date: 2019/5/19.
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<String> stack = new Stack<String>();

        for (char c : S.toCharArray()) {
            String temp = String.valueOf(c);
            if (stack.empty()) {
                stack.push(temp);
                continue;
            }

            if (temp.equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        Object[] objects = stack.toArray();

        StringBuilder sb = new StringBuilder();
        for (Object o : objects) {
            sb.append(o);
        }
        return sb.toString();
    }
}
