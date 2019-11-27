package tree.base;

import tree.TreeNode;

/**
 * @author jiangwu
 */
public class HighOfTree {

    public static int getHigh(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(getHigh(root.left) + 1, getHigh(root.right) + 1);
    }
}
