package com.sapphire.leetcode.algorithm.question1202;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Author: 柏云鹏
 * Date: 2020/2/21.
 */
public class ExchangeStringElements {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        char[] chars = s.toCharArray();

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (List<Integer> pair : pairs) {
            treeSet.addAll(pair);
        }

        List<Character> list = new ArrayList<Character>();

        for (Integer integer : treeSet) {
            list.add(chars[integer]);
        }

        Collections.sort(list);

        for (Character character : list) {
            chars[treeSet.pollFirst()] = character;
        }

        return new String(chars);
    }
}
