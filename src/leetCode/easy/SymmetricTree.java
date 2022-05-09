package leetCode.easy;

/*
Input: root = [1,2,2,3,4,4,3]
Output: true
Input: root = [1,2,2,null,3,null,3]
Output: false
*/

import leetCode.utils.TreeNode;

public class SymmetricTree {

    public static void main(String args[]) {
        // Symmetric tree
                    /*
        Construct the following tree
                   1
                 /   \
                /     \
               2       2
              /         \
             /           \
            4             4

        */
        TreeNode rootSymmetric = new TreeNode(1);
        rootSymmetric.left = new TreeNode(2);
        rootSymmetric.right = new TreeNode(2);
        rootSymmetric.left.left = new TreeNode(4);
        rootSymmetric.right.right = new TreeNode(4);
        // Assymmetric tree
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
        TreeNode rootAssymetric = new TreeNode(1);
        rootAssymetric.left = new TreeNode(2);
        rootAssymetric.right = new TreeNode(3);
        rootAssymetric.left.left = new TreeNode(4);
        rootAssymetric.right.left = new TreeNode(5);
        rootAssymetric.right.right = new TreeNode(6);
        rootAssymetric.right.left.left = new TreeNode(7);
        rootAssymetric.right.left.right = new TreeNode(8);

        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println(symmetricTree.isSymmetric(rootAssymetric));//false
        System.out.println(symmetricTree.isSymmetric(rootSymmetric));//true
    }

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 != null && root2 == null) return false;
        if (root1 == null && root2 != null) return false;
        if (root1.val != root2.val) return false;
        return helper(root1.left, root2.right) && helper(root1.right, root2.left);
    }
}
