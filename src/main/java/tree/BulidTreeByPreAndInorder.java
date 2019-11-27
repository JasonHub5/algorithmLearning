/*
105. Construct Binary Tree from Preorder and Inorder Traversal
Medium
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
 */
package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulidTreeByPreAndInorder {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }

        return build(preorder, inorder, 0);
    }

    private static TreeNode build(int[] preorder, int[] inorder, int preIndex) {
        if (inorder.length > 0 && preIndex < preorder.length) {
            TreeNode node = new TreeNode(preorder[preIndex]);

            int index = 0;
            for (int i = 0; i < inorder.length; i++) {
                if (inorder[i] == node.value) {
                    index = i;
                    break;
                }
            }
            node.left = build(preorder, Arrays.copyOfRange(inorder, 0, index), preIndex + 1);
            node.right = build(preorder, Arrays.copyOfRange(inorder, index + 1, inorder.length), preIndex + index + 1);
            return node;
        }
        return null;
    }
}
