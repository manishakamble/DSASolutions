package com.example.dsasolutions.trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode insert(TreeNode node, int data) {
        // base case
        if (node == null) {
            return new TreeNode(data);
        }

        // if the data is less than the
        // value of the current node
        if (data <= node.val) {
            // recur for left subtree
            node.left = insert(node.left, data);
        } else {
            // recur for the right subtree
            node.right = insert(node.right, data);
        }
        // return the node
        return node;
    }
}
