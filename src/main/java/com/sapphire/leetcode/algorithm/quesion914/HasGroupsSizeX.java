package com.sapphire.leetcode.algorithm.quesion914;

import org.junit.Assert;

import java.util.*;

/**
 * Author: 柏云鹏
 * Date: 2020/2/22.
 */
public class HasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : deck) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        List<Integer> list = new ArrayList<Integer>(map.values());

        Collections.sort(list);

        int temp = list.get(0);

        if (temp < 2) {
            return false;
        }

        Set<Integer> tlist = new HashSet<Integer>();

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                tlist.add(i);
                temp = temp / i;
            }
        }

        for (Integer integer : tlist) {
            boolean success = true;
            for (Integer value : map.values()) {
                if (value % integer != 0) {
                    success = false;
                    break;
                }
            }

            if (success) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,0,0,0,0,1,1,1,1,1};

        boolean result = new HasGroupsSizeX().hasGroupsSizeX(array);

        Assert.assertTrue(result);
    }
}
