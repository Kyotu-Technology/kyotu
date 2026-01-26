// Problem:
//
// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e.,
// from left to right, level by level).
// Examples:
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]
//
// Input: root = [1]
// Output: [[1]]
// Input: root = []
// Output: []

//  Definition for a binary tree node.
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {}
}
