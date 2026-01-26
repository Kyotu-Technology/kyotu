// Problem:
//
// Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e.,
// from left to right, level by level).
//
// Examples:
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]
//
// Input: root = [1]
// Output: [[1]]
// Input: root = []
// Output: []

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public List<List<Integer>> levelOrder(TreeNode root) {
    return List.of(List.of());
  }

  public static TreeNode constructTree(List<Integer> nums) {
    var nodes =
        nums.stream()
            .map(
                num -> {
                  if (num == null) {
                    return null;
                  } else {
                    return new TreeNode(num);
                  }
                })
            .collect(Collectors.toList());
    return constructTreeRec(nodes, 0);
  }

  public static TreeNode constructTreeRec(List<TreeNode> nodes, int currentPos) {
    if (currentPos >= nodes.size() || nodes.get(currentPos) == null) {
      return null;
    } else {
      nodes.get(currentPos).left = constructTreeRec(nodes, 2 * currentPos + 1);
      nodes.get(currentPos).right = constructTreeRec(nodes, 2 * currentPos + 2);
      return nodes.get(currentPos);
    }
  }

  public static void printTree(TreeNode node, String prefix, boolean isLeft) {
    if (node == null) {
      return;
    }

    System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);

    // Create the prefix for the children
    String newPrefix = prefix + (isLeft ? "│   " : "    ");

    // Recurse to children
    if (node.left != null || node.right != null) {
      printTree(node.left, newPrefix, true);
      printTree(node.right, newPrefix, false);
    }
  }

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(3, 9, 20, null, null, 15, 7);

    var tree = constructTree(nums);
    printTree(tree, "", false);
  }
}
