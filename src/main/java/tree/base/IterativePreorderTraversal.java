package tree.base;

import tree.TreeNode;

/**
 * 先序遍历
 */
public class IterativePreorderTraversal {
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        print(root.left);
        print(root.right);
    }
}
