package com.example.dsasolutions.trees;

public class RangeSumBST {

    /*
    * Given the root node of a binary search tree and two integers low and high,
    * return the sum of values of all nodes with a value in the inclusive range [low, high].
    * Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
      Output: 32
      Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.*/
    static int ans;

    public static int rangeSumBST(TreeNode root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;
    }

    public static void dfs(TreeNode root, int low, int high) {

        if (root != null) {
            if (low <= root.val && high >= root.val) {
                ans += root.val;
            }
            if (low < root.val) {
                dfs(root.left, low, high);
            }
            if (high > root.val) {
                dfs(root.right, low, high);
            }
        }

    }

    public static void main(String[] args) {

        TreeNode node = new TreeNode();
        node = node.insert(node, 10);
        node.insert(node, 5);
        node.insert(node, 15);
        node.insert(node, 3);
        node.insert(node, 7);
        node.insert(node, 18);
        int L = 7;
        int R = 15;
        int answer = rangeSumBST(node,L,R);
        System.out.println("Answer : "+answer);
    }
}
