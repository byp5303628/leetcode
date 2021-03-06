package com.sapphire.leetcode.algorithm.question412;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 柏云鹏
 * Date: 2019/6/16.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }

            if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            }

            list.add(String.valueOf(i));
        }

        return list;
    }
}
