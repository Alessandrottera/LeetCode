package leetCode.easy;

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.
        Input: root = [1,null,2,3]
        Output: [1,2,3]
*/

import leetCode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String args[]) {
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
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.left.right.right = new TreeNode(8);

        List<Integer> res = binaryTreePreorderTraversal.preorderTraversal(root);
        res.stream().forEach(leaf -> {
            System.out.println(leaf);
        });
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            helper(root.left, res);
            helper(root.right, res);
        }

    }
}

