package leetCode.easy;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
        Input: root = [1,null,2,3]
        Output: [1,3,2]
*/

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {

        /*
        Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        binaryTreeInorderTraversal.inorderTraversal(root);

    }

/*    public List<Integer> inorderTrasversalHelper()

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root.left != null) {
            inorderTraversal(root.left);
        }

        System.out.printf("%s ", root.val);

        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return result;
    }*/

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

}
