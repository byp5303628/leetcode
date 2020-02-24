package com.sapphire.leetcode.contest.contest177;

import org.junit.Assert;

import java.util.*;

/**
 * Author: 柏云鹏
 * Date: 2020/2/23.
 */
public class LargestMultipleOfThree {
    public String largestMultipleOfThree(int[] digits) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> priorityQueue = new ArrayList<Integer>();

        int temp = 0;

        for (int digit : digits) {
            int val = digit % 3;
            if (!map.containsKey(val)) {
                map.put(val, digit);
            } else {
                int old = map.get(val);
                map.put(val, Math.min(digit, old));
            }

            priorityQueue.add(digit);
            temp += val;
        }

        temp = temp % 3;

        Collections.sort(priorityQueue);

        StringBuilder sb = new StringBuilder();
        if (temp != 0 && !map.containsKey(temp) && !map.containsKey(0)) {
            return "";
        }


        for (Integer integer : priorityQueue) {
            if (temp != 0 && map.containsKey(temp)) {
                if (map.get(temp) == integer.intValue()) {
                    temp = 0;
                    continue;
                }
            } else if (temp != 0 && !map.containsKey(temp)) {
                if (integer % 3 != 0) {
                    continue;
                }
            }
            sb.append(integer);
        }

        String result = sb.reverse().toString();
        if (result.startsWith("0")) {
            return "0";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{8,6,7,1,0};

        String s = new LargestMultipleOfThree().largestMultipleOfThree(digits);

        Assert.assertNotNull(s);
    }
}
