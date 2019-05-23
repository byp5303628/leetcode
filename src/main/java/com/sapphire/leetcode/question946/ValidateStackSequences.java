package com.sapphire.leetcode.question946;

import java.util.Stack;

/**
 * Author: 柏云鹏
 * Date: 2019/5/23.
 */
public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<Integer>();

        int i = 0;
        int j = 0;
        while (i != pushed.length) {
            int num = pushed[i];
            stack.push(num);
            i++;

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
                if (j == popped.length) {
                    return true;
                }
            }
        }

        return stack.isEmpty();
    }
}
