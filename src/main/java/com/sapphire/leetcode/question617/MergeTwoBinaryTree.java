package com.sapphire.leetcode.question617;

/**
 * Author: 柏云鹏
 * Date: 2019/5/21.
 */
public class MergeTwoBinaryTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
