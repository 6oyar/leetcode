package easy._530;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 530. Minimum Absolute Difference in BST
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution {
    static TreeNode prev;
    static int min;

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5);
//        TreeNode three = new TreeNode(3);
//        TreeNode seven = new TreeNode(7);
//        root.left = three;
//        root.right = seven;
//
//        TreeNode two = new TreeNode(2);
//        TreeNode four = new TreeNode(4);
//        three.left = two;
//        three.right = four;
//
//        TreeNode six = new TreeNode(6);
//        TreeNode eight = new TreeNode(8);
//        seven.left = six;
//        seven.right = eight;

        TreeNode root = new TreeNode(5);
        TreeNode seven = new TreeNode(7);

        TreeNode four = new TreeNode(4);
        root.left = four;
        root.right = seven;

        System.out.println(getMinimumDifference(root));


    }

    public static int getMinimumDifference(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        AtomicInteger i = new AtomicInteger(Integer.MAX_VALUE);
        inorder(root, i);

        return i.get();
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static void inorder(TreeNode curr, AtomicInteger i) {

        if (curr == null)
            return;

        inorder(curr.left, i);

        if (prev != null)
            i.set(Math.min(curr.val - prev.val, i.get()));

        prev = curr;

        inorder(curr.right, i);
    }
}
