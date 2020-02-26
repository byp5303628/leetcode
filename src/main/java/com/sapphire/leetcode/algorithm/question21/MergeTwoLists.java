package com.sapphire.leetcode.algorithm.question21;

import com.sapphire.leetcode.ListNode;

/**
 * Author: 柏云鹏
 * Date: 2020/2/26.
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tail = new ListNode(0);
        ListNode temp = new ListNode(0);
        temp.next = tail;

        ListNode h1 = l1;
        ListNode h2 = l2;
        while (true) {
            if (h1 == null) {
                tail.next = h2;
                break;
            } else if (h2 == null) {
                tail.next = h1;
                break;
            }

            if (h1.val < h2.val) {
                tail.next = h1;
                h1 = h1.next;
                tail = tail.next;
            } else {
                tail.next = new ListNode(h2.val);
                h2 = h2.next;
                tail = tail.next;
            }
        }
        return temp.next.next;
    }
}
