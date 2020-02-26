package com.sapphire.leetcode.algorithm.question961;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 柏云鹏
 * Date: 2019/5/23.
 */
public class RepeatNTimes {
    public int repeatedNTimes(int[] A) {
        int count = A.length / 2;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : A) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if (map.get(num) == count) {
                result = num;
            }
        }

        return result;
    }
}
