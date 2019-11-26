package tree.base;

import tree.TreeNode;

public class CreateTree {
    public static TreeNode create(int[] nums) {
        return create(nums, 0);
    }

    public static TreeNode create(int[] nums, int index) {
        TreeNode tn = null;
        if (index < nums.length) {
            Integer value = nums[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = create(nums, 2 * index + 1);
            tn.right = create(nums, 2 * index + 2);
            return tn;
        }
        return tn;
    }

    public static TreeNode createBinaryTree(int[] nums) {
        TreeNode root = null;
        for (int value : nums) {
            root = createBinaryTree(root, value);
        }
        return root;
    }

    private static TreeNode createBinaryTree(TreeNode node, int value) {

        if (node == null) {
            return new TreeNode(value);
        }

        TreeNode newNode = new TreeNode(value);
        if (value < node.getValue()) {
            node.left = createBinaryTree(node.left, value);
        } else if (value > node.getValue()) {
            node.right = createBinaryTree(node.right, value);
        } else {
            return node;
        }
        return node;
    }
}
