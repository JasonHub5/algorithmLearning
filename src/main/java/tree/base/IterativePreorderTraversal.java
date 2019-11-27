package tree.base;

import tree.TreeNode;

import java.util.Stack;

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

    /**
     * 非递归遍历
     *
     * @param root
     */
    public static void print2(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            if (node != null) {
                System.out.print(node.getValue() + " ");
                stack.push(node.right);
                stack.push(node.left);
            }
        }
    }
}
