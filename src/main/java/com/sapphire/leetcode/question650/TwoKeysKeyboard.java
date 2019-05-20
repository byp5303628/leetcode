package com.sapphire.leetcode.question650;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 柏云鹏
 * Date: 2019/5/20.
 */
public class TwoKeysKeyboard {
    public int minSteps(int n) {
        if (n == 1) {
            return 0;
        }

        List<Integer> lists = getSub(n);

        if (lists.size() == 0) {
            return n;
        }

        int minSteps = Integer.MAX_VALUE;

        for (int sub : lists) {
            int left = minSteps(n / sub) + sub;
            int right = minSteps(sub) + n / sub;

            int temp = left > right ? right : left;

            if (temp < minSteps) {
                minSteps = temp;
            }
        }

        return minSteps;
    }

    public List<Integer> getSub(int n) {
        List<Integer> results = new ArrayList<Integer>();
        double d = Math.sqrt(n);

        int i = 2;
        while (i <= d) {
            if (n % i == 0) {
                results.add(i);
            }
            i++;
        }

        return results;
    }
}
