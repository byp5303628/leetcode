package com.sapphire.leetcode.question104;

import com.sapphire.leetcode.TreeNode;

/**
 * Author: 柏云鹏
 * Date: 2019/6/16.
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
