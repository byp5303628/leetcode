package com.sapphire.leetcode.contest.contest137;

import java.util.*;

/**
 * Author: 柏云鹏
 * Date: 2019/5/19.
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        TreeSet<Node> integers = new TreeSet<Node>();
        for (int i = 0; i < stones.length; i++) {
            Node n = new Node();
            n.index = i;
            n.val = stones[i];
            integers.add(n);
        }

        while (integers.size() > 1) {
            Node big = integers.last();
            integers.remove(integers.last());

            Node small = integers.last();
            integers.remove(integers.last());

            if (big.val == small.val) {
                continue;
            } else {
                Node n = new Node();
                n.index = small.index;
                n.val = big.val - small.val;
                integers.add(n);
            }
        }

        if (integers.size() > 0) {
            return integers.first().val;
        }
        return 0;
    }

    private static class Node implements Comparable<Node> {
        private int index;
        private int val;

        public int compareTo(Node o) {
            if (this.val == o.val) {
                return this.index - o.index;
            }
            return this.val - o.val;
        }
    }
}
