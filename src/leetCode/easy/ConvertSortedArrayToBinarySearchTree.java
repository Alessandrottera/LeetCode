package leetCode.easy;

/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9]

*/

import leetCode.utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public static void main(String[] args){
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
        TreeNode result = convertSortedArrayToBinarySearchTree.sortedArrayToBST(null);
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }
}
