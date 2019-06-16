package com.sapphire.leetcode.question872;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: 柏云鹏
 * Date: 2019/5/30.
 */
public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        getValues(root1, left);
        getValues(root2, right);

        return left.equals(right);
    }

    private void getValues(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if (node.left != null) {
            getValues(node.left, list);
        }

        if (node.right != null) {
            getValues(node.right, list);
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
