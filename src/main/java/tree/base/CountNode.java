package tree.base;

import tree.TreeNode;

public class CountNode {

    public static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
}
