package leetCode.easy;

//  Definition for a binary tree node.


import leetCode.utils.TreeNode;

class SameTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode0 = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1, treeNode, treeNode0);
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
