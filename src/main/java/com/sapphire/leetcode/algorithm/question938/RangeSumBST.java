package com.sapphire.leetcode.algorithm.question938;

/**
 * Author: 柏云鹏
 * Date: 2019/5/20.
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (L <= root.val && root.val <= R) {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        } else if (root.val < L){
            return rangeSumBST(root.right, L, R);
        } else {
            return rangeSumBST(root.left, L, R);
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
