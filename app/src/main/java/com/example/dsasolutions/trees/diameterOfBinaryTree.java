package com.example.dsasolutions.trees;

public class diameterOfBinaryTree {

    private static int diameter;

    public static int diameterOofBinaryTree(TreeNode root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private static int longestPath(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);
        diameter = Math.max(diameter, leftPath + rightPath);
        return Math.max(leftPath, rightPath) + 1;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node = node.insert(node, 10);
        node.insert(node, 5);
        node.insert(node, 15);
        node.insert(node, 3);
        node.insert(node, 7);
        node.insert(node, 18);

        int solution = diameterOofBinaryTree(node);

        System.out.println(solution);
    }
}
