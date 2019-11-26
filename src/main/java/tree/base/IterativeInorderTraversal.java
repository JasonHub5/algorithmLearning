package tree.base;

import tree.TreeNode;

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
}
