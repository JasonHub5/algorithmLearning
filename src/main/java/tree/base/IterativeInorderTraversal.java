package tree.base;

import tree.TreeNode;

import java.util.Stack;

public class IterativeInorderTraversal {

    /**
     * 顺序（中序）遍历
     *
     * @param root
     */
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.getValue() + " ");
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
        TreeNode node = root;
        while (true) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            if (stack.size() == 0) {
                return;
            }

            node = stack.pop();
            System.out.print(node.getValue() + " ");
            node = node.right;
        }
    }
}
