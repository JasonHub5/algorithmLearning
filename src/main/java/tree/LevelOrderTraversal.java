/*
102. Binary Tree Level Order Traversal
Medium
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

 */
package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author jiangwu
 */
public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> current = new ArrayList<>();
        current.add(root);
        while (current.size() > 0) {
            List<Integer> item = new ArrayList<>();
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node : current) {
                if (node != null) {
                    item.add(node.value);
                    next.add(node.left);
                    next.add(node.right);
                }
            }
            if (item.size() > 0) {
                result.add(item);
            }
            current = next;
        }
        return result;
    }
}
