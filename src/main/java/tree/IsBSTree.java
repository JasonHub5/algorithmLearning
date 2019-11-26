package tree;

public class IsBSTree {
    public static boolean check(TreeNode tree) {
        return check(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean check(TreeNode node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }
        if (node.value < minValue || node.value > maxValue) {
            return false;
        } else {
            return check(node.left, minValue, node.value) && check(node.right, node.value, maxValue);
        }
    }
}
