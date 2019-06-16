package com.sapphire.leetcode.question206;

import com.sapphire.leetcode.ListNode;

import java.util.Stack;

/**
 * Author: 柏云鹏
 * Date: 2019/6/16.
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
