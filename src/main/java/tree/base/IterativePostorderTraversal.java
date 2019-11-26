package tree.base;

import tree.TreeNode;

public class IterativePostorderTraversal {

    /**
     * 后序遍历
     *
     * @param root
     */
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        print(root.right);
        System.out.print(root.getValue() + " ");
    }
}
