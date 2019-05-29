package com.sapphire.leetcode.contest.contest138;


import java.util.*;

/**
 * Author: 柏云鹏
 * Date: 2019/5/26.
 */
public class DistantBarcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < barcodes.length; i++) {
            if (map.containsKey(barcodes[i])) {
                map.put(barcodes[i], map.get(barcodes[i]) + 1);
            } else {
                map.put(barcodes[i], 1);
            }
        }

        for (Integer i : map.keySet()) {
            treeMap.put(map.get(i), i);
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < treeMap.lastEntry().getKey(); i++) {
            list.add(treeMap.lastEntry().getValue());
        }
        map.remove(treeMap.lastEntry().getValue());

        int l = list.size();


        int j = 1;

        int count = 0;
        int loop = 1;
        for (Integer i : map.keySet()) {
            int val = i;
            for (int index = 0; index < map.get(i); index++) {
                count++;

                list.add(j, val);
                j += 2;

                if (count >= l) {
                    count = 0;
                    loop++;
                    j = loop;
                }
            }
        }

        for (int i = 0; i < barcodes.length; i++) {
            barcodes[i] = list.get(i);
        }

        return barcodes;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 7, 7, 8, 5, 7, 5, 5, 5, 8};

        int[] a = new DistantBarcodes().rearrangeBarcodes(array);

        int[] array1 = new int[]{1, 1, 1, 2, 2, 2};
        int[] array2 = new int[]{1, 1, 1, 1, 2, 2, 3, 3};

        int[] a1 = new DistantBarcodes().rearrangeBarcodes(array1);
        int[] a2 = new DistantBarcodes().rearrangeBarcodes(array2);
        org.junit.Assert.assertNotNull(a);

    }
}
