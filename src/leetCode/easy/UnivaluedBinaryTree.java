package leetCode.easy;

/*
A binary tree is uni-valued if every
node in the tree has the same value.
Given the root of a binary tree, return
true if the given tree is uni-valued, or false otherwise.
Input: root = [1,1,1,1,1,null,1]
Output: true
Input: root = [2,2,2,5,2]
Output: false
*/


import leetCode.utils.TreeNode;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        UnivaluedBinaryTree univaluedBinaryTree = new UnivaluedBinaryTree();

        TreeNode rootUnival = new TreeNode(1);
        rootUnival.left = new TreeNode(1);
        rootUnival.right = new TreeNode(1);
        rootUnival.left.left = new TreeNode(1);
        rootUnival.right.left = new TreeNode(1);
        rootUnival.right.right = new TreeNode(1);
        rootUnival.right.left.left = new TreeNode(1);
        rootUnival.right.left.right = new TreeNode(1);
        rootUnival.right.left.right.right = new TreeNode(1);

        TreeNode rootNotUnival = new TreeNode(1);
        rootNotUnival.left = new TreeNode(2);
        rootNotUnival.right = new TreeNode(1);
        rootNotUnival.left.left = new TreeNode(1);

        System.out.println(univaluedBinaryTree.isUnivalTree(rootNotUnival));//false
        //System.out.println(univaluedBinaryTree.isUnivalTree(rootUnival));// true

    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        return helper(root, root.val);
    }

    private boolean helper(TreeNode root, int val) {
        if (root != null) {
            if (root.val != val) return false;
            return helper(root.left, val) && helper(root.right, val);
        }
        return true;
    }
}
