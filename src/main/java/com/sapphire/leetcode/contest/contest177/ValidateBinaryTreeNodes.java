package com.sapphire.leetcode.contest.contest177;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 柏云鹏
 * Date: 2020/2/23.
 */
public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
        for (int i = 0; i < n; i++) {
            map.put(i, new TreeNode(i, leftChild[i], rightChild[i]));
        }

        for (TreeNode value : map.values()) {
            if (value.root == 0) {
                if (value.left != -1) {
                    map.get(value.left).root = value.node;
                }

                if (value.right != -1) {
                    map.get(value.right).root = value.node;
                }
            } else {
                return false;
            }
        }

        for (TreeNode value : map.values()) {
        }

        return true;
    }

    private static class TreeNode {
        int node;
        int root = 0;

        int left;
        int right;

        public TreeNode(int node, int left, int right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }
    }
}
